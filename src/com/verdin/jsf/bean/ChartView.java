package com.verdin.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.charts.ChartDataSet;

@ManagedBean
@RequestScoped
public class ChartView implements Serializable {
	
	private static final long serialVersionUID = -6345160256194390311L;
	private static final int MAX_AGE = 100;
	
	private int currentAge = 30;
	private double currentIncome = 100000.00;
	private double current401KValue = 50000.00;
	private int targetRetirementAge = 65;
	private double contribution401KPercentage = 3.0;
	private double investmentGrowth = 8.0;
	private double incomeGrowth = 2.5;
	private double retirementYearlyExpensesPercentage = 80.0;

	private LineChartModel model401k;
	private LineChartModel modelIncome;
	private LineChartModel modelExpenses;
	
	private ArrayList<LineChartSeries> additionalIncomeSeries = new ArrayList<LineChartSeries>(); 
	private LineChartSeries expenseSeries;
	private LineChartSeries netSeries;
	private LineChartSeries preRetirement401k;
	private LineChartSeries postRetirement401k;
	private LineChartSeries preRetirementIncome;
	
	private double max401k = 0;
	private double maxAge = 0;
		
	private ArrayList<AdditionalIncomeSourceBean> additionalIncomeSources = new ArrayList<AdditionalIncomeSourceBean>();
		
	public ChartView() {
		additionalIncomeSources.add(new AdditionalIncomeSourceBean("Social Security", 10000, true, 62));
		additionalIncomeSources.add(new AdditionalIncomeSourceBean("Pension", 20000, true, 55));
		additionalIncomeSources.add(new AdditionalIncomeSourceBean("", 0, false, 0));
		
		calculateModel();
	}
	
	@PostConstruct
	public void init() {
	    calculateModel();
	}
		
	public void actionListener(ActionEvent actionEvent) {
	    // Add event code here...
	    System.out.println("Made it!");
	}
	
	public void morePressed(AjaxBehaviorEvent e) {

	    System.out.println("Made it!");
	}
	
	public void onValueChanged(AjaxBehaviorEvent e) {
		System.out.println("onValueChange");
		calculateModel();
	}
	
	public void submit() {
		System.out.println("submitted!");
		calculateModel();
	}
	
	/**
	 * Calculates the value of money for each year
	 * @param startingAge - Age to start calculating at - each year before this will be set to zero
	 * @param initialAmount - the initial amount of money at that age
	 * @param growthRate - The growth rate as a percentage such as 8.0
	 * @return - returns a list of calculated values
	 */
	public LineChartSeries calculateMoneyGrowth(double startingAge, double initialAmount, double growthRate, double finalAge) {
		LineChartSeries moneyList = new LineChartSeries();
			
		// Zero out the array list		
		/*for(int i = 1; i < startingAge; i++) {
			moneyList.set(i, 0.0);
		}*/
		
		// Now calculate the value of the money for each year
		double currentAmount = initialAmount;
		
		for(int i = (int) startingAge; i <= finalAge; i++) {
			moneyList.set(i, currentAmount);
			currentAmount = currentAmount * (1 + growthRate/100);
		}
		
		return moneyList;
	}
	
	public void calculateModel() {
		System.out.println("calculateModel");
		
		model401k = new LineChartModel();
		modelIncome = new LineChartModel();
		modelExpenses = new LineChartModel();
		
		for(@SuppressWarnings("unused") LineChartSeries currentSeries : additionalIncomeSeries ) 
			currentSeries = new LineChartSeries();
		expenseSeries = new LineChartSeries();
		netSeries = new LineChartSeries();
		preRetirement401k = new LineChartSeries();
		postRetirement401k = new LineChartSeries();
		preRetirementIncome = new LineChartSeries();
		
		calculateFixedIncome();
		
		double finalIncome = calculateIncome();
		
		calculateExpenses(finalIncome); 			
		
		calculateNet();
		
		calculate401k();
		
		setChart(model401k, "401K Value");
		
		setChart(modelIncome, "Income");
		
		setChart(modelExpenses, "Retirement Expenses");
		
	}
	
	private void setChart(LineChartModel chart, String title) {
		chart.setLegendPosition("nw");
		Axis yAxis = chart.getAxis(AxisType.Y);
		yAxis.setMin(0);
		yAxis.setTickFormat("$%'.0f");
		
		Axis xAxis = chart.getAxis(AxisType.X);
		xAxis.setMin(currentAge);
		xAxis.setMax(maxAge);
		xAxis.setTickFormat("%.0f");		
		
		chart.setTitle(title);
	}

	private void calculate401k() {			
		
		calculatePreRetirement401k();
		
		calculatePostRetirement401k();	
	}

	private void calculatePreRetirement401k() {
		double calculated401KValue = getCurrent401KValue();
		max401k = calculated401KValue;
		int calculatedAge;
				
		// set the initial value
		preRetirement401k.set(getCurrentAge(), calculated401KValue);
		
		for(calculatedAge = getCurrentAge() + 1; calculatedAge < getTargetRetirementAge(); calculatedAge++) {
			calculated401KValue = calculated401KValue * (1 + getInvestmentGrowth()/100) + 
										(double) (getDataPoint(preRetirementIncome, calculatedAge)) * getContribution401KPercentage()/100;
			
			preRetirement401k.set(calculatedAge, calculated401KValue);
					
			if(max401k < calculated401KValue)
				max401k = calculated401KValue;
		}
		
		preRetirement401k.setLabel("Pre-retirement 401K Value");
		model401k.addSeries(preRetirement401k);	
		
	}

	private void calculatePostRetirement401k() {
		int calculatedAge = getTargetRetirementAge();
		double calculated401KValue = (double)(getDataPoint(preRetirement401k, calculatedAge - 1));
		
		postRetirement401k.set(calculatedAge, calculated401KValue);
		postRetirement401k.setLabel("Post Retirement 401K Value");

		while(calculated401KValue > 0 && calculatedAge < MAX_AGE) {
			calculated401KValue = calculated401KValue * (1 + getInvestmentGrowth()/100) - (double) (getDataPoint(netSeries, calculatedAge));
			postRetirement401k.set(calculatedAge, calculated401KValue);
			
			if(max401k < calculated401KValue)
				max401k = calculated401KValue;
			
			calculatedAge++;
		}
		
		maxAge = calculatedAge;
				
		model401k.addSeries(postRetirement401k);			
	}

	private void calculateNet() {
		netSeries = new LineChartSeries();
		
		double net;
		
		for(int currentAge = 1; currentAge <= MAX_AGE; currentAge++){
			net = getDataPoint(expenseSeries, currentAge);
			for(int i = 0; i < additionalIncomeSeries.size(); i++) {
				net -= getDataPoint(additionalIncomeSeries.get(i), currentAge);
			} 
			netSeries.set(currentAge, net);
		}
		
		//netSeries.setFill(true);
		
		//modelIncome.addSeries(netSeries);
	}

	private double getDataPoint(LineChartSeries series, int i) {
		if(series.getData().get(i) != null)
			return (double) series.getData().get(i);
		else 
			return 0;
	}

	private double calculateIncome() {
		preRetirementIncome = calculateMoneyGrowth(getCurrentAge(),
				getCurrentIncome(),
				getIncomeGrowth(),
				getTargetRetirementAge());
		
		preRetirementIncome.setLabel("Pre-retirement Income");
		modelIncome.addSeries(preRetirementIncome);
		
		return (double) preRetirementIncome.getData().get(getTargetRetirementAge());		
	}

	private void calculateExpenses(double finalIncome) {
		expenseSeries = calculateMoneyGrowth(getTargetRetirementAge(), 
				finalIncome * getRetirementYearlyExpensesPercentage() / 100,  
				getIncomeGrowth(), MAX_AGE);
		
		expenseSeries.setLabel("Retirement Expenses");
		modelExpenses.addSeries(expenseSeries);
	}

	private void calculateFixedIncome() {
		additionalIncomeSeries = new ArrayList<LineChartSeries>(); 
		
		// Calculate the future value of the additional income sources
		for(int i = 0; i < 3; i++){
			// should we even consider this source?
			if(additionalIncomeSources.get(i).getEffectiveAge() > 0 && additionalIncomeSources.get(i).getYearlyAmount() > 0) {

				// Start with no growth			
				double growthRate = 0.0;

				// Is this inflation adjusted?
				if(additionalIncomeSources.get(i).getInflationAdjusted())
					growthRate = this.getIncomeGrowth();

				additionalIncomeSeries.add(calculateMoneyGrowth(additionalIncomeSources.get(i).getEffectiveAge(), 
						additionalIncomeSources.get(i).getYearlyAmount(),
						growthRate, MAX_AGE));

				additionalIncomeSeries.get(i).setLabel(additionalIncomeSources.get(i).getSourceName());
				//additionalIncomeSeries.get(i).setFill(true);
				
				modelIncome.addSeries(additionalIncomeSeries.get(i));
			}
		}	
	}

	public LineChartModel getModel401k() {
		return model401k;
	}
	
	public LineChartModel getModelIncome() {
		return modelIncome;
	}
	
	public void setCurrentAge(int newAge) {
		this.currentAge = newAge;
	}
	
	public int getCurrentAge() {
		return this.currentAge;
	}
	
	public void setCurrentIncome(double newIncome) {
		this.currentIncome = newIncome;
	}
	
	public double getCurrentIncome() {
		return this.currentIncome;
	}

	public double getCurrent401KValue() {
		return current401KValue;
	}

	public void setCurrent401KValue(double current401KValue) {
		this.current401KValue = current401KValue;
	}

	public int getTargetRetirementAge() {
		return targetRetirementAge;
	}

	public void setTargetRetirementAge(int targetRetirementAge) {
		this.targetRetirementAge = targetRetirementAge;
	}

	public double getContribution401KPercentage() {
		return contribution401KPercentage;
	}

	public void setContribution401KPercentage(double contribution401kPercentage) {
		contribution401KPercentage = contribution401kPercentage;
	}

	public double getInvestmentGrowth() {
		return investmentGrowth;
	}

	public void setInvestmentGrowth(double investmentGrowth) {
		this.investmentGrowth = investmentGrowth;
	}

	public double getIncomeGrowth() {
		return incomeGrowth;
	}

	public void setIncomeGrowth(double incomeGrowth) {
		this.incomeGrowth = incomeGrowth;
	}

	public double getRetirementYearlyExpensesPercentage() {
		return retirementYearlyExpensesPercentage;
	}

	public void setRetirementYearlyExpensesPercentage(double retirementYearlyExpensesPercentage) {
		this.retirementYearlyExpensesPercentage = retirementYearlyExpensesPercentage;
	}

	public ArrayList<AdditionalIncomeSourceBean> getAdditionalIncomeSources() {
		return additionalIncomeSources;
	}

	public void setAdditionalIncomeSources(ArrayList<AdditionalIncomeSourceBean> additionalIncomeSources) {
		this.additionalIncomeSources = additionalIncomeSources;
	}

	public LineChartModel getModelExpenses() {
		return modelExpenses;
	}

	public void setModelExpenses(LineChartModel modelExpenses) {
		this.modelExpenses = modelExpenses;
	}
	
	
	/* private static final long serialVersionUID = 1L;
	 * 
	 * private PieChartModel pieModel1; private PieChartModel pieModel2; private
	 * DonutChartModel donutModel1; private DonutChartModel donutModel2; private
	 * DonutChartModel donutModel3; private DonutChartModel donutModel4; private
	 * DonutChartModel donutModel5; private LineChartModel lineModel1; private
	 * LineChartModel lineModel2; private LineChartModel lineModel3; private
	 * LineChartModel areaModel1;
	 * 
	 * @PostConstruct public void init() { createPieModels(); createDonutModels();
	 * createLineModels(); createAreaModels(); }
	 * 
	 * public PieChartModel getPieModel1() { return pieModel1; }
	 * 
	 * public PieChartModel getPieModel2() { return pieModel2; }
	 * 
	 * public DonutChartModel getDonutModel1() { return donutModel1; }
	 * 
	 * public DonutChartModel getDonutModel2() { return donutModel2; }
	 * 
	 * public DonutChartModel getDonutModel3() { return donutModel3; }
	 * 
	 * public DonutChartModel getDonutModel4() { return donutModel4; }
	 * 
	 * public DonutChartModel getDonutModel5() { return donutModel5; }
	 * 
	 * public LineChartModel getLineModel1() { return lineModel1; }
	 * 
	 * public LineChartModel getLineModel2() { return lineModel2; }
	 * 
	 * public LineChartModel getLineModel3() { return lineModel3; }
	 * 
	 * public LineChartModel getAreaModel1() { return areaModel1; }
	 * 
	 * private void createPieModels() { createPieModel1(); createPieModel2(); }
	 * 
	 * private void createDonutModels() { donutModel1 = initDonutModel();
	 * donutModel2 = initDonutModel2(); donutModel3 = initDonutModel3(); donutModel4
	 * = initDonutModel4(); donutModel5 = initDonutModel5(); }
	 * 
	 * private void createLineModels() { lineModel1 = initLineModel1(); lineModel2 =
	 * initLineModel2(); lineModel3 = initLineModel3(); }
	 * 
	 * private void createAreaModels() { areaModel1 = initAreaModel1(); Axis xAxis =
	 * areaModel1.getAxis(AxisType.X); Axis yAxis = areaModel1.getAxis(AxisType.Y);
	 * 
	 * yAxis.setMin(0); xAxis.setMin(2000); xAxis.setMax(2010); }
	 * 
	 * private void createPieModel1() { pieModel1 = new PieChartModel();
	 * 
	 * pieModel1.set("Brand 1", 540); pieModel1.set("Brand 2", 325);
	 * pieModel1.set("Brand 3", 702); pieModel1.set("Brand 4", 421); }
	 * 
	 * private void createPieModel2() { pieModel2 = new PieChartModel();
	 * 
	 * pieModel2.set("Brand 1", 540); pieModel2.set("Brand 2", 325);
	 * pieModel2.set("Brand 3", 702); pieModel2.set("Brand 4", 421); }
	 * 
	 * private DonutChartModel initDonutModel() { DonutChartModel model = new
	 * DonutChartModel();
	 * 
	 * Map<String, Number> circle1 = new LinkedHashMap<String, Number>();
	 * circle1.put("Free", 94); circle1.put("Memory Usage", 6);
	 * 
	 * model.addCircle(circle1);
	 * 
	 * return model; }
	 * 
	 * private DonutChartModel initDonutModel2() { DonutChartModel model = new
	 * DonutChartModel();
	 * 
	 * Map<String, Number> circle2 = new LinkedHashMap<String, Number>();
	 * circle2.put("Free", 60); circle2.put("Memory Usage", 40);
	 * 
	 * model.addCircle(circle2);
	 * 
	 * return model; }
	 * 
	 * private DonutChartModel initDonutModel3() { DonutChartModel model = new
	 * DonutChartModel();
	 * 
	 * Map<String, Number> circle3 = new LinkedHashMap<String, Number>();
	 * circle3.put("Free", 99.6); circle3.put("Memory Usage", 0.4);
	 * 
	 * model.addCircle(circle3);
	 * 
	 * return model; }
	 * 
	 * private DonutChartModel initDonutModel4() { DonutChartModel model = new
	 * DonutChartModel();
	 * 
	 * Map<String, Number> circle4= new LinkedHashMap<String, Number>();
	 * circle4.put("Free", 95); circle4.put("Memory Usage", 5);
	 * 
	 * model.addCircle(circle4);
	 * 
	 * return model; }
	 * 
	 * private DonutChartModel initDonutModel5() { DonutChartModel model = new
	 * DonutChartModel();
	 * 
	 * Map<String, Number> circle5= new LinkedHashMap<String, Number>();
	 * circle5.put("Free", 90); circle5.put("Memory Usage", 10);
	 * 
	 * model.addCircle(circle5);
	 * 
	 * return model; }
	 * 
	 * private LineChartModel initLineModel1() { LineChartModel model = new
	 * LineChartModel();
	 * 
	 * LineChartSeries series1 = new LineChartSeries();
	 * series1.setLabel("Series 1");
	 * 
	 * series1.set(1, 2); series1.set(2, 1); series1.set(3, 3); series1.set(4, 6);
	 * series1.set(5, 8);
	 * 
	 * LineChartSeries series2 = new LineChartSeries();
	 * series2.setLabel("Series 2");
	 * 
	 * series2.set(1, 6); series2.set(2, 3); series2.set(3, 2); series2.set(4, 7);
	 * series2.set(5, 9);
	 * 
	 * model.addSeries(series1); model.addSeries(series2);
	 * 
	 * return model; }
	 * 
	 * private LineChartModel initLineModel2() { LineChartModel model = new
	 * LineChartModel();
	 * 
	 * LineChartSeries series1 = new LineChartSeries();
	 * series1.setLabel("Series 1");
	 * 
	 * series1.set(1, 2); series1.set(2, 1); series1.set(3, 3); series1.set(4, 6);
	 * series1.set(5, 8);
	 * 
	 * LineChartSeries series2 = new LineChartSeries();
	 * series2.setLabel("Series 2");
	 * 
	 * series2.set(1, 6); series2.set(2, 3); series2.set(3, 2); series2.set(4, 7);
	 * series2.set(5, 9);
	 * 
	 * model.addSeries(series1); model.addSeries(series2);
	 * 
	 * return model; }
	 * 
	 * private LineChartModel initLineModel3() { LineChartModel model = new
	 * LineChartModel();
	 * 
	 * LineChartSeries series1 = new LineChartSeries();
	 * series1.setLabel("Series 1");
	 * 
	 * series1.set(1, 2); series1.set(2, 1); series1.set(3, 3); series1.set(4, 6);
	 * series1.set(5, 8);
	 * 
	 * LineChartSeries series2 = new LineChartSeries();
	 * series2.setLabel("Series 2");
	 * 
	 * series2.set(1, 6); series2.set(2, 3); series2.set(3, 2); series2.set(4, 7);
	 * series2.set(5, 9);
	 * 
	 * model.addSeries(series1); model.addSeries(series2);
	 * 
	 * return model; }
	 * 
	 * private LineChartModel initAreaModel1() { LineChartModel model = new
	 * LineChartModel();
	 * 
	 * LineChartSeries boys = new LineChartSeries(); boys.setFill(true);
	 * boys.setLabel("Boys"); boys.set("2004", 120); boys.set("2005", 100);
	 * boys.set("2006", 44); boys.set("2007", 150); boys.set("2008", 25);
	 * 
	 * LineChartSeries girls = new LineChartSeries(); girls.setFill(true);
	 * girls.setLabel("Girls"); girls.set("2004", 52); girls.set("2005", 60);
	 * girls.set("2006", 110); girls.set("2007", 90); girls.set("2008", 120);
	 * 
	 * model.addSeries(boys); model.addSeries(girls);
	 * 
	 * return model; }
	 */
}