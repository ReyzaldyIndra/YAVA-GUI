package com.roasted.model;

import java.io.Serializable;
	
	@SuppressWarnings("serial")
	public  class ContainerMetrics implements Serializable{
	
//	static final long serialVersionUID = 4553230673859196378L;
	public long DURATION;
	public String APP_ID, CONTAINER_ID, HOSTNAME;
	public java.util.Date START_TIME, FINISH_TIME;
	
	public ContainerMetrics() {
		// TODO Auto-generated constructor stub
	}
	public ContainerMetrics(String APP_ID, String CONTAINER_ID, String HOSTNAME, long DURATION, java.util.Date START_TIME, java.util.Date FINISH_TIME) {
		// TODO Auto-generated constructor stub
		this.APP_ID =  APP_ID;
		this.CONTAINER_ID = CONTAINER_ID;
		this.HOSTNAME = HOSTNAME;
		this.DURATION = DURATION;
		this.START_TIME = START_TIME;
		this.FINISH_TIME = FINISH_TIME;
	}
	
	public String getAppId() {
		return APP_ID;
	}
	public void setAppId(String APP_ID){
		this.APP_ID = APP_ID;
	}
	
	public String getContainerId(){
		return CONTAINER_ID;
	}

	public void setContainerId(String CONTAINER_ID){
		this.CONTAINER_ID=CONTAINER_ID;
	}
	
	public String getHostname() {
		return APP_ID;
	}
	public void setHostname(String HOSTNAME){
		this.HOSTNAME = HOSTNAME;
	}
	
	public java.util.Date getStartTime() {
		return START_TIME;
	}
	public void setStartTime(java.util.Date START_TIME){
		this.START_TIME = START_TIME;
	}
	
	public java.util.Date getFinishTime() {
		return START_TIME;
	}
	public void setFinishTime(java.util.Date FINISH_TIME){
		this.FINISH_TIME = FINISH_TIME;
	}
	
	public long getDuration() {
		return DURATION;
	}
	public void setDuration(long DURATION){
		this.DURATION = DURATION;
	}
}
