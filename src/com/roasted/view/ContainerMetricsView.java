package com.roasted.view;


import java.util.List;
import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;
//import javax.faces.bean.ViewScoped;
//import javax.inject.Inject;
//import javax.inject.Named;


//import java.sql.SQLException;
import javax.enterprise.context.ApplicationScoped;
//import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
//import javax.inject.Inject;
//import java.io.Serializable;
import com.roasted.model.ContainerMetrics;
import com.roasted.network.ContainerMetricsConnect;

@Named("cmview")
@ApplicationScoped

public class ContainerMetricsView {

	public List<ContainerMetrics> getContainermetrics() {
		return containermetrics;
	}

	public void setContainermetrics(List<ContainerMetrics> containermetrics) {
		this.containermetrics = containermetrics;
	}

	public ContainerMetricsConnect getConnect() {
		return connect;
	}

	private List<ContainerMetrics> containermetrics;
	
//	@ManagedProperty("#{ContainerMetricsConnect}")
	private ContainerMetricsConnect connect;
	
	@PostConstruct
	public void init(){
		try {
			containermetrics = connect.containerMetrics();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<ContainerMetrics> getContainerMetrics(){
		return containermetrics;
	}

	public void setConnect(ContainerMetricsConnect connect) {
		this.connect = connect;
	}

}
