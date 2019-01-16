package com.jsf.bean;

import java.io.Serializable;
import org.jboss.logging.Logger;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class HDFSService implements Serializable{
	static Logger logger = Logger.getLogger(HDFSService.class);
	
	
	static String DEFAULT_USER = "admin";
	static String DEFAULT_PASS = "admin";
	static String CLUSTER = "";
	static String HOSTNAME = "192.168.3.132";
	
	static String DEFAULT_SERVICE = "HDFS";
	

}
