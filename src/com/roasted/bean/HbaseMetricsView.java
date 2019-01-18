package com.roasted.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;
import javax.inject.Inject;

import com.roasted.network.HbaseMetricsConnect;
import com.roasted.model.HbaseMetricsData;
import java.io.Serializable;

@Named("container_metrics_view")
@ConversationScoped

public class HbaseMetricsView implements Serializable{
	//diganti sesuai UID table
//	static final long serialVersionUID = 12345678913l;
	
	private List<HbaseMetricsData> o;
	@Inject
	
	private HbaseMetricsConnect service;
	
	public List<HbaseMetricsData> getMetrics(){
        return o;
    }
	
	
	 @PostConstruct
	    public void init() {
	    	try {
	    		o = service.getMetrics();
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    }
	       
	 
	    public void setService(HbaseMetricsConnect service) {
	        this.service = service;
	    }


		public List<HbaseMetricsData> getO() {
			return o;
		}


		public void setO(List<HbaseMetricsData> o) {
			this.o = o;
		}
	    
	    

}
