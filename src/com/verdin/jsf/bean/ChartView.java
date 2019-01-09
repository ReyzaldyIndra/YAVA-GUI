package com.verdin.jsf.bean;

import javax.annotation.PostConstruct;
//import javax.enterprise.context.ApplicationScoped;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.DonutChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean
@RequestScoped
public class ChartView implements Serializable {
private static final long serialVersionUID = 1L;

  private PieChartModel pieModel1;
  private PieChartModel pieModel2;
  private DonutChartModel donutModel1;
  private DonutChartModel donutModel2;
  private DonutChartModel donutModel3;
  private DonutChartModel donutModel4;
  private DonutChartModel donutModel5;
  private LineChartModel lineModel1;
  private LineChartModel lineModel2;
  private LineChartModel lineModel3;
  private LineChartModel areaModel1;
  
  @PostConstruct
  public void init() {
      createPieModels();
      createDonutModels();
      createLineModels();
      createAreaModels();
  }

  public PieChartModel getPieModel1() {
      return pieModel1;
  }
   
  public PieChartModel getPieModel2() {
      return pieModel2;
  }
  
  public DonutChartModel getDonutModel1() {
	  return donutModel1;
  }
  
  public DonutChartModel getDonutModel2() {
	  return donutModel2;
  }
  
  public DonutChartModel getDonutModel3() {
	  return donutModel3;
  }
  
  public DonutChartModel getDonutModel4() {
	  return donutModel4;
  }
  
  public DonutChartModel getDonutModel5() {
	  return donutModel5;
  }
  
  public LineChartModel getLineModel1() {
	  return lineModel1;
  }
  
  public LineChartModel getLineModel2() {
	  return lineModel2;
  }
  
  public LineChartModel getLineModel3() {
	  return lineModel3;
  }
  
  public LineChartModel getAreaModel1() {
	  return areaModel1;
  }
  
  private void createPieModels() {
      createPieModel1();
      createPieModel2();
  } 

  private void createDonutModels() {
	  donutModel1 = initDonutModel();
	  donutModel2 = initDonutModel2();
	  donutModel3 = initDonutModel3();
	  donutModel4 = initDonutModel4();
	  donutModel5 = initDonutModel5();
  }
  
  private void createLineModels() {
	  lineModel1 = initLineModel1();
	  lineModel2 = initLineModel2();
	  lineModel3 = initLineModel3();	  
  }
  
  private void createAreaModels() {
	  areaModel1 = initAreaModel1();
      Axis xAxis = areaModel1.getAxis(AxisType.X);
      Axis yAxis = areaModel1.getAxis(AxisType.Y);
      
      yAxis.setMin(0);
      xAxis.setMin(2000);
      xAxis.setMax(2010);
  }
  
  private void createPieModel1() {
      pieModel1 = new PieChartModel();
       
      pieModel1.set("Brand 1", 540);
      pieModel1.set("Brand 2", 325);
      pieModel1.set("Brand 3", 702);
      pieModel1.set("Brand 4", 421);      
  }
   
  private void createPieModel2() {
      pieModel2 = new PieChartModel();
       
      pieModel2.set("Brand 1", 540);
      pieModel2.set("Brand 2", 325);
      pieModel2.set("Brand 3", 702);
      pieModel2.set("Brand 4", 421);       
  }
  
  private DonutChartModel initDonutModel() {      
	  DonutChartModel model = new DonutChartModel();   

      Map<String, Number> circle1 = new LinkedHashMap<String, Number>();
      circle1.put("Free", 94);
      circle1.put("Memory Usage", 6);
      
      model.addCircle(circle1);
      
      return model;
  }
  
  private DonutChartModel initDonutModel2() {
	  DonutChartModel model = new DonutChartModel();
	  
	  Map<String, Number> circle2 = new LinkedHashMap<String, Number>();
      circle2.put("Free", 60);
      circle2.put("Memory Usage", 40);
      
      model.addCircle(circle2);
      
      return model;
  }
  
  private DonutChartModel initDonutModel3() {
	  DonutChartModel model = new DonutChartModel();
	  
	  Map<String, Number> circle3 = new LinkedHashMap<String, Number>();
      circle3.put("Free", 99.6);
      circle3.put("Memory Usage", 0.4);
      
      model.addCircle(circle3);
      
      return model;
  }
  
  private DonutChartModel initDonutModel4() {
	  DonutChartModel model = new DonutChartModel();
	  
	  Map<String, Number> circle4= new LinkedHashMap<String, Number>();
      circle4.put("Free", 95);
      circle4.put("Memory Usage", 5);
      
      model.addCircle(circle4);
      
      return model;
  }
  
  private DonutChartModel initDonutModel5() {
	  DonutChartModel model = new DonutChartModel();
	  
	  Map<String, Number> circle5= new LinkedHashMap<String, Number>();
      circle5.put("Free", 90);
      circle5.put("Memory Usage", 10);
      
      model.addCircle(circle5);
      
      return model;
  }
  
  private LineChartModel initLineModel1() {
	  LineChartModel model = new LineChartModel();
	  
      LineChartSeries series1 = new LineChartSeries();
      series1.setLabel("Series 1");

      series1.set(1, 2);
      series1.set(2, 1);
      series1.set(3, 3);
      series1.set(4, 6);
      series1.set(5, 8);

      LineChartSeries series2 = new LineChartSeries();
      series2.setLabel("Series 2");

      series2.set(1, 6);
      series2.set(2, 3);
      series2.set(3, 2);
      series2.set(4, 7);
      series2.set(5, 9);

      model.addSeries(series1);
      model.addSeries(series2);

      return model;
  }
  
  private LineChartModel initLineModel2() {
	  LineChartModel model = new LineChartModel();
	  
      LineChartSeries series1 = new LineChartSeries();
      series1.setLabel("Series 1");

      series1.set(1, 2);
      series1.set(2, 1);
      series1.set(3, 3);
      series1.set(4, 6);
      series1.set(5, 8);

      LineChartSeries series2 = new LineChartSeries();
      series2.setLabel("Series 2");

      series2.set(1, 6);
      series2.set(2, 3);
      series2.set(3, 2);
      series2.set(4, 7);
      series2.set(5, 9);

      model.addSeries(series1);
      model.addSeries(series2);

      return model;
  }
  
  private LineChartModel initLineModel3() {
	  LineChartModel model = new LineChartModel();
	  
      LineChartSeries series1 = new LineChartSeries();
      series1.setLabel("Series 1");

      series1.set(1, 2);
      series1.set(2, 1);
      series1.set(3, 3);
      series1.set(4, 6);
      series1.set(5, 8);

      LineChartSeries series2 = new LineChartSeries();
      series2.setLabel("Series 2");

      series2.set(1, 6);
      series2.set(2, 3);
      series2.set(3, 2);
      series2.set(4, 7);
      series2.set(5, 9);

      model.addSeries(series1);
      model.addSeries(series2);

      return model;
  } 
  
  private LineChartModel initAreaModel1() {
	  LineChartModel model = new LineChartModel();
	  
	  LineChartSeries boys = new LineChartSeries();
      boys.setFill(true);
      boys.setLabel("Boys");
      boys.set("2004", 120);
      boys.set("2005", 100);
      boys.set("2006", 44);
      boys.set("2007", 150);
      boys.set("2008", 25);

      LineChartSeries girls = new LineChartSeries();
      girls.setFill(true);
      girls.setLabel("Girls");
      girls.set("2004", 52);
      girls.set("2005", 60);
      girls.set("2006", 110);
      girls.set("2007", 90);
      girls.set("2008", 120);
      
      model.addSeries(boys);
      model.addSeries(girls);
      
      return model;
  }
}