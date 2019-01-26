package com.roasted.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

import com.roasted.model.ContainerMetrics;

import java.util.List;
import java.util.ArrayList;

public class MetricsAggregateDaily {
	
	
	
	
	public static void main(String args[]) throws Exception {
	    Connection conn;
	    Properties prop = new Properties();
	    
	    Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
	    //conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:/hbase-unsecure");
	    conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure");

	    System.out.println("got connection");

	    
	    ResultSet rst = conn.createStatement().executeQuery("select * from METRICS_AGGREGATE_DAILY");
//	    
	    while (rst.next()) {
	      
	      
	    }
	  }

}
