package com.verdin.jsf.model;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.primefaces.event.SlideEndEvent;
 
@ManagedBean
public class sliderView {
	
    private int number5;
    private	int number2;
    private	int number4;
    private int number6;
    private int number7;
    private int number8;
    private int number9;
    private int number10;
    private int number11;
    private int number12;
    private int number13;
    private int number14;
    private int number15;
    private int minmapmemoryvalue;
    private int maxmapmemoryvalue;
    
    
    public int getNumber5() {
        return number5;
    }
 
    public void setNumber5(int number5) {
        this.number5 = number5;
    }
   
    public int getNumber2() {
        return number2;
    }
 
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public int getNumber4() {
        return number4;
    }
 
    public void setNumber4(int number4) {
        this.number4 = number4;
    }
    
    public int getNumber6() {
        return number6;
    }
 
    public void setNumber6(int number6) {
        this.number6 = number6;
    }
    public int getNumber7() {
        return number7;
    }
 
    public void setNumber7(int number7) {
        this.number7 = number7;
    }
    
    public int getNumber8() {
        return number8;
    }
 
    public void setNumber8(int number8) {
        this.number8 = number8;
    }
    public int getNumber9() {
        return number9;
    }
 
    public void setNumber9(int number9) {
        this.number9 = number9;
    }
    
    public int getNumber10() {
        return number10;
    }
 
    public void setNumber10(int number10) {
        this.number10 = number10;
    }
    public int getNumber11() {
        return number11;
    }
 
    public void setNumber11(int number11) {
        this.number11 = number11;
    }
    
    public int getNumber12() {
        return number12;
    }
 
    public void setNumber12(int number12) {
        this.number12 = number12;
    }
    public int getNumber13() {
        return number13;
    }
 
    public void setNumber13(int number13) {
        this.number13 = number13;
    }
    
    public int getNumber14() {
        return number14;
    }
 
    public void setNumber14(int number14) {
        this.number14 = number14;
    }
    public int getNumber15() {
        return number15;
    }
 
    public void setNumber15(int number15) {
        this.number15 = number15;
    }
    
    public int getMinmapmemoryvalue() {
    	return minmapmemoryvalue;
    }
    public void setMinmapmemoryvalue(int minmapmemoryvalue) {
    	this.minmapmemoryvalue = minmapmemoryvalue;
    }
    
    public int getMaxmapmemoryvalue() {
    	return maxmapmemoryvalue;
    }
    public void setMaxmapmemoryvalue(int maxmapmemoryvalue) {
    	this.maxmapmemoryvalue = maxmapmemoryvalue;
    }
    
    public void onInputChanged(ValueChangeEvent event) {
        FacesMessage message = new FacesMessage("Input Changed", "Value: " + event.getNewValue());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
 
    public void onSlideEnd(SlideEndEvent event) {
        FacesMessage message = new FacesMessage("Slide Ended", "Value: " + event.getValue());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
