package com.roasted.model;

import java.io.Serializable;

public class HbaseMetricsData implements Serializable{
	static final long serialVersionUID = 12345678912l;
	
	
	//SQL Object pada table "CONTAINER_METRICS"
	public HbaseMetricsData () {
		
		}
	
	String app_id;
	String container_id;
	String start_time;
	String finish_time;
	int duration;
	
	public String getApp_id() {
		return app_id;
	}
	
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}
	
	public String getContainer_id() {
		return app_id;
	}
	
	public void setContainer_id(String container_id) {
		this.container_id = container_id;
	}
	
	public String getStart_time() {
		return start_time;
	}
	
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	
	public String getFinish_time() {
		return finish_time;
	}
	
	public void setFinish_time(String finish_time) {
		this.finish_time = finish_time;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
