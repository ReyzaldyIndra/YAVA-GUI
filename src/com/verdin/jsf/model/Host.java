package com.verdin.jsf.model;

import java.io.Serializable;

public class Host implements Serializable {
	static final long serialVersionUID = 12345678912l;
/* 
 host_id                | bigint                   | not null  | plain    |              | 
 host_name              | character varying(255)   | not null  | extended |              | 
 cpu_count              | integer                  | not null  | plain    |              | 
 ph_cpu_count           | integer                  |           | plain    |              | 
 cpu_info               | character varying(255)   | not null  | extended |              | 
 discovery_status       | character varying(2000)  | not null  | extended |              | 
 host_attributes        | character varying(20000) | not null  | extended |              | 
 ipv4                   | character varying(255)   |           | extended |              | 
 ipv6                   | character varying(255)   |           | extended |              | 
 public_host_name       | character varying(255)   |           | extended |              | 
 last_registration_time | bigint                   | not null  | plain    |              | 
 os_arch                | character varying(255)   | not null  | extended |              | 
 os_info                | character varying(1000)  | not null  | extended |              | 
 os_type                | character varying(255)   | not null  | extended |              | 
 rack_info              | character varying(255)   | not null  | extended |              | 
 total_mem              | bigint                   | not null  | plain    |              | 
*/

	int host_id;
	String host_name;
	int cpu_count;
	int ph_cpu_count;
	String cpu_info;
	String discovery_status; 
	String host_attributes; 
	String ipv4; 
	String ipv6; 
	String public_host_name; 
	long last_registration_time; 
	String os_arch; 
	String os_info; 
	String os_type; 
	String rack_info; 
	int total_mem;
	
	public Host() {
	
	};
	
	
	public int getHost_id() {
		return host_id;
	}
	public void setHost_id(int host_id) {
		this.host_id = host_id;
	}
	public String getHost_name() {
		return host_name;
	}
	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}
	public int getCpu_count() {
		return cpu_count;
	}
	public void setCpu_count(int cpu_count) {
		this.cpu_count = cpu_count;
	}
	public int getPh_cpu_count() {
		return ph_cpu_count;
	}
	public void setPh_cpu_count(int ph_cpu_count) {
		this.ph_cpu_count = ph_cpu_count;
	}
	public String getCpu_info() {
		return cpu_info;
	}
	public void setCpu_info(String cpu_info) {
		this.cpu_info = cpu_info;
	}
	public String getDiscovery_status() {
		return discovery_status;
	}
	public void setDiscovery_status(String discovery_status) {
		this.discovery_status = discovery_status;
	}
	public String getHost_attributes() {
		return host_attributes;
	}
	public void setHost_attributes(String host_attributes) {
		this.host_attributes = host_attributes;
	}
	public String getIpv4() {
		return ipv4;
	}
	public void setIpv4(String ipv4) {
		this.ipv4 = ipv4;
	}
	public String getIpv6() {
		return ipv6;
	}
	public void setIpv6(String ipv6) {
		this.ipv6 = ipv6;
	}
	public String getPublic_host_name() {
		return public_host_name;
	}
	public void setPublic_host_name(String public_host_name) {
		this.public_host_name = public_host_name;
	}
	public long getLast_registration_time() {
		return last_registration_time;
	}
	public void setLast_registration_time(long last_registration_time) {
		this.last_registration_time = last_registration_time;
	}
	public String getOs_arch() {
		return os_arch;
	}
	public void setOs_arch(String os_arch) {
		this.os_arch = os_arch;
	}
	public String getOs_info() {
		return os_info;
	}
	public void setOs_info(String os_info) {
		this.os_info = os_info;
	}
	public String getOs_type() {
		return os_type;
	}
	public void setOs_type(String os_type) {
		this.os_type = os_type;
	}
	public String getRack_info() {
		return rack_info;
	}
	public void setRack_info(String rack_info) {
		this.rack_info = rack_info;
	}
	public int getTotal_mem() {
		return total_mem;
	}
	public void setTotal_mem(int total_mem) {
		this.total_mem = total_mem;
	}
		
	
}

