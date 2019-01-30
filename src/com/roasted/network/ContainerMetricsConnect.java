package com.roasted.network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.util.Properties;
import java.util.Date;

//import javax.inject.Named;
import javax.faces.bean.RequestScoped;
//import javax.inject.Inject;
import javax.faces.bean.ManagedBean;


import com.roasted.model.ContainerMetrics;

//import java.util.List;
import java.util.ArrayList;

//untuk setup koneksi dengan query Hbase

//@SuppressWarnings("serial")
@ManagedBean(name = "connect")
@RequestScoped
public class ContainerMetricsConnect{
	
		 public ArrayList<ContainerMetrics> containerMetrics() throws ClassNotFoundException, SQLException{
				
				ArrayList<ContainerMetrics> container_metrics = new ArrayList<ContainerMetrics>();
				
				Connection conn;
			    Properties prop = new Properties();

			   
			    	Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
			    
				    conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure");
				    
				    ResultSet rst;
				    rst = conn.createStatement().executeQuery("select * from CONTAINER_METRICS");
				    
			    	ContainerMetrics cm = new ContainerMetrics();
				    while(rst.next()) {
				    	
				    	cm.app_id = rst.getString("APP_ID");
				    	cm.setAppId(rst.getString("APP_ID"));
				    	cm.setContainerId(rst.getString("CONTAINER_ID"));
				    	cm.setHostname(rst.getString("HOSTNAME"));
				    	cm.setDuration(rst.getLong("DURATION"));
				    	cm.setCurrentTime(System.currentTimeMillis());
				    	Date st = rst.getDate("START_TIME");
				    	cm.setStartTime(st.getTime());
				    	Date ft = rst.getDate("FINISH_TIME");
				    	cm.setFinishTime(ft.getTime());
				    	cm.setMem_requested_gb(rst.getDouble("MEM_REQUESTED_GB"));
				    	cm.setMem_virtual_gb(rst.getDouble("MEM_VIRTUAL_GB"));
				    	cm.setMem_used_gb_min(rst.getDouble("MEM_USED_GB_MIN"));
				    	cm.setMem_used_gb_max(rst.getDouble("MEM_USED_GB_MAX"));
				    	cm.setMem_used_gb_avg(rst.getDouble("MEM_USED_GB_AVG"));

				    	/*
				    	 * 
				    	 CONTAINER_METRICS                        | MEM_USED_GB_50_PC |
						 CONTAINER_METRICS                        | MEM_USED_GB_75_PC |
 						 CONTAINER_METRICS                        | MEM_USED_GB_90_PC |
						 CONTAINER_METRICS                        | MEM_USED_GB_95_PC |
    					 CONTAINER_METRICS                        | MEM_USED_GB_99_PC |
						 CONTAINER_METRICS                        | MEM_UNUSED_GB     |
						 CONTAINER_METRICS                        | MEM_UNUSED_GB_MIL
				    	 */
				    	container_metrics.add(cm);
				    	System.out.println(cm.getAppId());
				    	System.out.println("TESTiejfeiheheifbeofh392r95y93r893y4398hfehfiugfef89yr3ey9032r309er23-0ur390hfof923h");

				    }
			    
				return container_metrics;
			}
		}
