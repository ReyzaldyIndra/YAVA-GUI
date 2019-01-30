package com.roasted.model;

import java.io.Serializable;
	
	
	@SuppressWarnings("serial")
	public  class ContainerMetrics implements Serializable{
	
//	static final long serialVersionUID = 4553230673859196378L;
	public long duration;
	public String app_id, container_id, hostname;
	public long current_time;
	public long start_time, finish_time;
	public double mem_requested_gb, mem_virtual_gb, mem_used_gb_min,
					mem_used_gb_max, mem_used_gb_avg, mem_used_gb_50_pc,
					mem_used_75_pc, mem_used_90_pc, mem_used_95_pc, 
					mem_used_99_pc, mem_unused_gb, mem_unused_gb_mil; 	
	
	public ContainerMetrics(String appId, String containerId, String Hostname, long Duration, long currentTime, long startTime, long finishTime,
		double mem_requested_gb, double mem_virtual_gb, double mem_used_gb_min,
		double mem_used_gb_max, double mem_used_gb_avg, double mem_used_gb_50_pc,
		double mem_used_75_pc, double mem_used_90_pc, double mem_used_95_pc, 
		double mem_used_99_pc, double mem_unused_gb, double mem_unused_gb_mil) {
		// TODO Auto-generated constructor stub
		set(appId, containerId, Hostname, Duration, currentTime, startTime, finishTime, 
				mem_requested_gb, mem_virtual_gb, mem_used_gb_min,
				mem_used_gb_max, mem_used_gb_avg, mem_used_gb_50_pc,
				mem_used_75_pc, mem_used_90_pc, mem_used_95_pc, 
				mem_used_99_pc, mem_unused_gb, mem_unused_gb_mil);
		
	}
	
	private void set(String appId, String containerId, String Hostname, long Duration, long currentTime,long startTime, long finishTime, 
			double mem_requested_gb, double mem_virtual_gb, 
			double mem_used_gb_min, double mem_used_gb_max, 
			double mem_used_gb_avg, double mem_used_gb_50_pc, 
			double mem_used_75_pc, double mem_used_90_pc, 
			double mem_used_95_pc, double mem_used_99_pc, 
			double mem_unused_gb, double mem_unused_gb_mil) {
		// TODO Auto-generated method stub
		
		setAppId(appId);
		setContainerId(containerId);
		setHostname(Hostname);
		setDuration(Duration);
		setCurrentTime(currentTime);
		setStartTime(startTime);
		setFinishTime(finishTime);
		setMem_requested_gb(mem_requested_gb);
		setMem_virtual_gb(mem_virtual_gb);
		setMem_used_gb_min(mem_used_gb_min);
		setMem_used_gb_max(mem_used_gb_max);
		setMem_used_gb_avg(mem_used_gb_avg);
		setMem_used_gb_50_pc(mem_used_gb_50_pc);
		setMem_used_75_pc(mem_used_75_pc);
		setMem_used_90_pc(mem_used_90_pc);
		setMem_used_95_pc(mem_used_95_pc);
		setMem_used_99_pc(mem_used_99_pc);
		setMem_unused_gb(mem_unused_gb);
		setMem_unused_gb_mil(mem_unused_gb_mil);
		
		
	}



	public double getMem_requested_gb() {
		return mem_requested_gb;
	}

	public void setMem_requested_gb(double mem_requested_gb) {
		this.mem_requested_gb = mem_requested_gb;
	}

	public double getMem_virtual_gb() {
		return mem_virtual_gb;
	}

	public void setMem_virtual_gb(double mem_virtual_gb) {
		this.mem_virtual_gb = mem_virtual_gb;
	}

	public double getMem_used_gb_min() {
		return mem_used_gb_min;
	}

	public void setMem_used_gb_min(double mem_used_gb_min) {
		this.mem_used_gb_min = mem_used_gb_min;
	}

	public double getMem_used_gb_max() {
		return mem_used_gb_max;
	}

	public void setMem_used_gb_max(double mem_used_gb_max) {
		this.mem_used_gb_max = mem_used_gb_max;
	}

	public double getMem_used_gb_avg() {
		return mem_used_gb_avg;
	}

	public void setMem_used_gb_avg(double mem_used_gb_avg) {
		this.mem_used_gb_avg = mem_used_gb_avg;
	}

	public double getMem_used_gb_50_pc() {
		return mem_used_gb_50_pc;
	}

	public void setMem_used_gb_50_pc(double mem_used_gb_50_pc) {
		this.mem_used_gb_50_pc = mem_used_gb_50_pc;
	}

	public double getMem_used_75_pc() {
		return mem_used_75_pc;
	}

	public void setMem_used_75_pc(double mem_used_75_pc) {
		this.mem_used_75_pc = mem_used_75_pc;
	}

	public double getMem_used_90_pc() {
		return mem_used_90_pc;
	}

	public void setMem_used_90_pc(double mem_used_90_pc) {
		this.mem_used_90_pc = mem_used_90_pc;
	}

	public double getMem_used_95_pc() {
		return mem_used_95_pc;
	}

	public void setMem_used_95_pc(double mem_used_95_pc) {
		this.mem_used_95_pc = mem_used_95_pc;
	}

	public double getMem_used_99_pc() {
		return mem_used_99_pc;
	}

	public void setMem_used_99_pc(double mem_used_99_pc) {
		this.mem_used_99_pc = mem_used_99_pc;
	}

	public double getMem_unused_gb() {
		return mem_unused_gb;
	}

	public void setMem_unused_gb(double mem_unused_gb) {
		this.mem_unused_gb = mem_unused_gb;
	}

	public double getMem_unused_gb_mil() {
		return mem_unused_gb_mil;
	}

	public void setMem_unused_gb_mil(double mem_unused_gb_mil) {
		this.mem_unused_gb_mil = mem_unused_gb_mil;
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
