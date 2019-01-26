package com.roasted.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

public class MetricRecordHourly {
	
	public static void main(String args[]) throws Exception {
	    Connection conn;
	    Properties prop = new Properties();
	    
	    Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
	    //conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:/hbase-unsecure");
	    conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure");

	    System.out.println("got connection");
	    
	    ResultSet rst = conn.createStatement().executeQuery("select * from METRIC_RECORD_HOURLY_UUID");
	    while (rst.next()) {
	      System.out.println(rst.getString(1) + " " + rst.getString(2) + " " + rst.getString(3) + " " + rst.getString(4) + " " + rst.getString(5) + " " + rst.getString(6));
	    }
	  }

}
