package com.verdin.jsf.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.extensions.model.layout.LayoutOptions;

import org.jboss.logging.Logger;



@ManagedBean  
@ViewScoped  
public class ElementLayoutController implements Serializable {  
  
    private static final long serialVersionUID = 20120925L;  
  
    private String stateOne;  
    private String stateTwo;  
    private boolean layoutOneShown = true;  
  
    private LayoutOptions layoutOptionsOne;  
    private LayoutOptions layoutOptionsTwo;  
  
    static Logger logger = Logger.getLogger(ElementLayoutController.class);
    
    private static int _togle_counter = 0;
    
    @PostConstruct  
    protected void initialize() {  
        // 1. set options for first layout  
        layoutOptionsOne = new LayoutOptions();  
  
        // options for all panes (center and west)  
        LayoutOptions panes = new LayoutOptions();  
        panes.addOption("slidable", false);  
        panes.addOption("resizeWhileDragging", true);  
        layoutOptionsOne.setPanesOptions(panes);  
  
        // options for west pane  
        LayoutOptions west = new LayoutOptions();  
        west.addOption("size", 150);  
        west.addOption("minSize", 40);  
        west.addOption("maxSize", 300);  
        layoutOptionsOne.setWestOptions(west);  
  
        // 2. set options for second layout  
        layoutOptionsTwo = new LayoutOptions();  
  
        // options for all panes  
        panes = new LayoutOptions();  
        panes.addOption("slidable", false);  
        panes.addOption("resizeWhileDragging", true);  
        layoutOptionsTwo.setPanesOptions(panes);  
  
        // options for east pane  
        LayoutOptions east = new LayoutOptions();  
        panes.addOption("resizable", false);  
        panes.addOption("closable", false);  
        east.addOption("size", "50%");  
        layoutOptionsTwo.setEastOptions(east);  
  
        // options for nested east layout  
        LayoutOptions childEastOptions = new LayoutOptions();  
        east.setChildOptions(childEastOptions);  
  
        // options for east-south pane  
        LayoutOptions eastSouth = new LayoutOptions();  
        eastSouth.addOption("size", "50%");  
        childEastOptions.setSouthOptions(eastSouth);  
    }  
  
    public String getStateOne() {  
        return stateOne;  
    }  
  
    public void setStateOne(String stateOne) {  
        this.stateOne = stateOne;  
    }  
  
    public String getStateTwo() {  
        return stateTwo;  
    }  
  
    public void setStateTwo(String stateTwo) {  
        this.stateTwo = stateTwo;  
    }  
  
    public void toogleLayout(ActionEvent event) {  
    	
    	logger.info(event.getComponent().toString());
    	
    	logger.info("toogleLayout "+ _togle_counter++);
    	
        layoutOneShown = !layoutOneShown;  
    }  
  
    public boolean isLayoutOneShown() {  
        return layoutOneShown;  
    }  
  
    public LayoutOptions getLayoutOptionsOne() {  
        return layoutOptionsOne;  
    }  
  
    public LayoutOptions getLayoutOptionsTwo() {  
        return layoutOptionsTwo;  
    }  
}  
            