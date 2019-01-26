package com.verdin.jsf.bean;

import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
public class SelectBooleanView {
 
    private boolean value1;  
    private boolean value2;
    private boolean value3;
 
    public boolean isValue1() {
        return value1;
    }
 
    public void setValue1(boolean value1) {
        this.value1 = value1;
    }
 
    public boolean isValue2() {
        return value2;
    }
 
    public void setValue2(boolean value2) {
        this.value2 = value2;
    }
    
    public boolean isValue3() {
        return value3;
    }
 
    public void setValue3(boolean value3) {
        this.value3 = value3;
    }
    public void addMessage() {
        String summary = value2 ? "Checked" : "Unchecked";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
    }
}