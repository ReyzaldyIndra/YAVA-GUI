package com.roasted.network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Date;

import javax.enterprise.context.ApplicationScoped;
//import javax.inject.Named;
import javax.faces.bean.ManagedBean;


import com.roasted.model.ContainerMetrics;

import java.util.List;
import java.util.ArrayList;




//untuk setup koneksi dengan query Hbase

//@SuppressWarnings("serial")
@ManagedBean(name="ContainerMetricsConnect")
@ApplicationScoped
public class ContainerMetricsConnect{
	
	
		 public List<ContainerMetrics> containerMetrics() throws ClassNotFoundException, SQLException{
				
				List<ContainerMetrics> container_metrics = new ArrayList<ContainerMetrics>();
				
				Connection conn;
			    Properties prop = new Properties();
			    
			    Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
			    conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure");
			    
			    ResultSet rst;
			    rst = conn.createStatement().executeQuery("select * from CONTAINER_METRICS");
			    
		    	ContainerMetrics cm = new ContainerMetrics();
			    while(rst.next()) {
			    	
			    	cm.setAppId(rst.getString("app_id"));
			    	cm.setContainerId(rst.getString("container_id"));
			    	cm.setHostname(rst.getString("hostname"));
			    	cm.setDuration(rst.getLong("duration"));
			    	cm.setCurrentTime(System.currentTimeMillis());
			    	Date st = rst.getDate("start_time");
			    	cm.setStartTime(st.getTime());
			    	Date ft = rst.getDate("finish_time");
			    	cm.setFinishTime(ft.getTime());

			    	
			    	container_metrics.add(cm);
			    	System.out.println(cm);
			    	
			    	
			    }
				
				
				return container_metrics;
				
			}
		}
