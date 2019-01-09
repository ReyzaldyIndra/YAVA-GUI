package com.verdin.jsf.model;

import java.io.Serializable;

public class Stack implements Serializable {
	static final long serialVersionUID = 12345678913l;
	/*
	 *     Column     |          Type          | Collation | Nullable | Default 
	 *  --------------+------------------------+-----------+----------+---------
 	 *	stack_id      | bigint                 |           | not null | 
 	 *	stack_name    | character varying(255) |           | not null | 
 	 *	stack_version | character varying(255) |           | not null | 
	 */
	
	int stack_id;
	String stack_name;
	String stack_version;
	
	
	public int getStack_id() {
		return stack_id;
	}
	public void setStack_id(int stack_id) {
		this.stack_id = stack_id;
	}
	public String getStack_name() {
		return stack_name;
	}
	public void setStack_name(String stack_name) {
		this.stack_name = stack_name;
	}
	public String getStack_version() {
		return stack_version;
	}
	public void setStack_version(String stack_version) {
		this.stack_version = stack_version;
	}
	
	
	
	
}
