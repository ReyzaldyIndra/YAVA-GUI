package com.verdin.jsf.model;

public class Param {

	String key;
	String value;
	
	public Param(String param, String value) {
		this.key = param;
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String param) {
		this.key = param;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}

