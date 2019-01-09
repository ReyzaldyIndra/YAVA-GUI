package com.verdin.jsf.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.extensions.model.layout.LayoutOptions;
import org.jboss.logging.Logger;

@ManagedBean  
@RequestScoped  
public class CustomContentLayoutController implements Serializable {

	private static final long serialVersionUID = 20120925L;

	private String src = "/sections/layout/example-customContentOne.xhtml";
	private LayoutOptions layoutOptions;

    static Logger logger = Logger.getLogger(CustomContentLayoutController.class);

	
	
	@PostConstruct
	protected void initialize() {
		layoutOptions = new LayoutOptions();

		// options for all panes
		LayoutOptions panes = new LayoutOptions();
		panes.addOption("slidable", false);
		layoutOptions.setPanesOptions(panes);

		// north pane
		LayoutOptions north = new LayoutOptions();
		north.addOption("resizable", false);
		north.addOption("closable", false);
		north.addOption("size", 60);
		north.addOption("spacing_open", 0);
		layoutOptions.setNorthOptions(north);

		// south pane
		LayoutOptions south = new LayoutOptions();
		south.addOption("resizable", false);
		south.addOption("closable", false);
		south.addOption("size", 28);
		south.addOption("spacing_open", 0);
		layoutOptions.setSouthOptions(south);

		// west pane
		LayoutOptions west = new LayoutOptions();
		west.addOption("size", 340);
		west.addOption("minSize", 150);
		west.addOption("maxSize", 500);
		layoutOptions.setWestOptions(west);

		LayoutOptions center = new LayoutOptions();
		center.addOption("resizable", false);
		center.addOption("closable", false);
		center.addOption("minWidth", 200);
		center.addOption("minHeight", 60);
		layoutOptions.setCenterOptions(center);

		// set options for nested center layout
		LayoutOptions optionsNested = new LayoutOptions();
		center.setChildOptions(optionsNested);

		// options for center-north pane
		LayoutOptions centerNorth = new LayoutOptions();
		centerNorth.addOption("size", "50%");
		optionsNested.setNorthOptions(centerNorth);

		// options for center-center pane
		LayoutOptions centerCenter = new LayoutOptions();
		centerCenter.addOption("minHeight", 60);
		optionsNested.setCenterOptions(centerCenter);
	}

	public LayoutOptions getLayoutOptions() {
		
		logger.info("getLayoutOptions()");
		
		return layoutOptions;
	}

	public String getSrc() {
		logger.info("getSrc()");
		
		return src;
	}

	public void showMessages() {
		
		FacesContext fc = FacesContext.getCurrentInstance();
		
		FacesMessage msg1 = new FacesMessage(FacesMessage.SEVERITY_ERROR, "This is the first error message", null);
		FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_ERROR, "This is the second error message", null);

		fc.addMessage(null, msg1);
		fc.addMessage(null, msg2);
		
		logger.info(msg1.toString());
	}

	public void hideMessages() {
		logger.info("nothing to do");
		// nothing to do
	}
}
            