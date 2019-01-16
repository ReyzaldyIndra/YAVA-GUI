package com.roasted.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import com.roasted.network.HbaseMetricsConnect;
import com.roasted.model.HbaseMetrics;

@Named("container_metrics_view")
@ApplicationScoped

public class HbaseMetricsView implements Serializable{
	//diganti sesuai UID table
	static final long serialVersionUID = 12345678913l;
	
	private List<HbaseMetrics> hbase_metrics;
	@Inject
	
	private HbaseMetricsConnect service;
	
	 @PostConstruct
	    public void init() {
	    	try {
	    		hbase_metrics = service.getMetrics();
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    }
	     
	    public List<HbaseMetrics> getMetrics(){
	        return hbase_metrics;
	    }
	 
	    public void setService(HbaseMetricsConnect service) {
	        this.service = service;
	    }

}
