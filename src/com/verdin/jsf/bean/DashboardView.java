package com.verdin.jsf.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CloseEvent;
import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.event.ToggleEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

import javax.annotation.PostConstruct;

@ManagedBean
@ViewScoped
public class DashboardView implements Serializable {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DashboardModel model;
     
    @PostConstruct
    public void init() {
        model = new DefaultDashboardModel();
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();
        DashboardColumn column4 = new DefaultDashboardColumn();
         
        column1.addWidget("memoryUsage");
        column1.addWidget("clusterLoad");
        column1.addWidget("NameNodeGCcount");
        column1.addWidget("NameNodeHostLoad");
        column1.addWidget("UnderReplicatedBlocks");
         
        column2.addWidget("networkUsage");
        column2.addWidget("HDFSDiskUsage");
        column2.addWidget("NameNodeGCtime");
        column2.addWidget("NameNodeRPC");
        column2.addWidget("HDFSSpaceUtilization");
        column2.addWidget("hbaseMasterHeap");        
         
        column3.addWidget("nameNodeHeap");
        column3.addWidget("nameNodeCPUWIO");
        column3.addWidget("NNConnectionLoad");
        column3.addWidget("Faileddiskvolumes");
        column3.addWidget("Add");
        
        column4.addWidget("CPUUsage");
        column4.addWidget("resourceManageHeap");
        column4.addWidget("NameNodeHeap");
        column4.addWidget("BlocksWithCorruptedReplicas");
 
        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
        model.addColumn(column4);
    }
     
    public void handleReorder(DashboardReorderEvent event) {
        FacesMessage message = new FacesMessage();
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        message.setSummary("Reordered: " + event.getWidgetId());
        message.setDetail("Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex() + ", Sender index: " + event.getSenderColumnIndex());
         
        addMessage(message);
    }
     
    public void handleClose(CloseEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel Closed", "Closed panel id:'" + event.getComponent().getId() + "'");
         
        addMessage(message);
    }
     
    public void handleToggle(ToggleEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, event.getComponent().getId() + " toggled", "Status:" + event.getVisibility().name());
         
        addMessage(message);
    }
     
    private void addMessage(FacesMessage message) {
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
     
    public DashboardModel getModel() {
        return model;
    }
}