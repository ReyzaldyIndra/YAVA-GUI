package com.roasted.model;

import java.io.Serializable;
	
	
	public  class ContainerMetrics implements Serializable{
	
//	static final long serialVersionUID = 4553230673859196378L;
	public long duration;
	public String app_id, container_id, hostname;
	
	public long current_time;
	public long start_time, finish_time;
	
	public ContainerMetrics(String app_id, String container_id, String hostname, long duration, long current_time, long start_time, long finish_time) {
		// TODO Auto-generated constructor stub
		this.app_id =  app_id;
		this.container_id = container_id;
		this.hostname = hostname;
		this.duration = duration;
		this.current_time = current_time;
		this.start_time = start_time;
		this.finish_time = finish_time;
		
	}
	
	public ContainerMetrics() {
		// TODO Auto-generated constructor stub
	}

	public String getAppId() {
		return app_id;
	}
	public void setAppId(String app_id){
		this.app_id = app_id;
	}
	
	public String getContainerId(){
		return container_id;
	}

	public void setContainerId(String container_id){
		this.container_id=container_id;
	}
	
	public String getHostname() {
		return app_id;
	}
	public void setHostname(String hostname){
		this.hostname = hostname;
	}
	
	public long getCurrentTime() {
		return current_time;
	}
	public void setCurrentTime(long current_time) {
		this.current_time = current_time;
	}
	
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration){
		this.duration = duration;
	}

	public long getStartTime() {
		return start_time;
	}

	public void setStartTime(long start_time) {
		this.start_time = start_time;
	}

	public long getFinishTime() {
		return finish_time;
	}

	public void setFinishTime(long finish_time) {
		this.finish_time = finish_time;
	}

	
}
