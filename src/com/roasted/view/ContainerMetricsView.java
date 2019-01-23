package com.roasted.view;


import java.util.List;
import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;
//import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.sql.SQLException;

import com.roasted.model.ContainerMetrics;
import com.roasted.network.ContainerMetricsConnect;


//import javax.enterprise.context.SessionScoped;

import javax.enterprise.context.ApplicationScoped;

@Named("ContainerMetrics")
@ApplicationScoped
public class ContainerMetricsView {
	private List<ContainerMetrics> _container_metrics;
	
	
	private ContainerMetricsConnect connect;
	
	@PostConstruct
	public void init() throws SQLException, Exception {
//		_container_metrics = connect.selectTable();
	}
	
	
	public List<ContainerMetrics> getContainerMetrics(){
		return _container_metrics;
	}
	
//	public void setConnect(ContainerMetricsConnect connect) {
//		this.connect = connect;
//	}

}
