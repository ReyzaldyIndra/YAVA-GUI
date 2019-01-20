package com.roasted.network;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


//import java.util.List;

import org.jboss.logging.Logger;

import com.roasted.model.HbaseMetricsData;
import java.util.List;
import java.util.ArrayList;

//@Named("hbase_connect")
@ApplicationScoped
public class HbaseMetricsConnect{
	
	static Logger logger = Logger.getLogger(HbaseMetricsConnect.class);
	
		static final String url = "jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure";
//		static final String user = "root";
//		static final String pass = "geheim247";
		
		public List<HbaseMetricsData> getMetrics() throws Exception{
		
		List<HbaseMetricsData> _hbase_metrics = new ArrayList<HbaseMetricsData>();
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			   Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
			   con = DriverManager.getConnection(url);
			   
			   st = con.createStatement();
			   String sql;
			   sql = "select * from CONTAINER_METRICS";
			   rs = st.executeQuery(sql);
			   
			   while(rs.next()) {
//				   String data = rs.getString(1);
//				   System.out.println(data);
				   
				   HbaseMetricsData hm = new HbaseMetricsData();
				   
				   hm.setApp_id(rs.getString("app_id"));
				   hm.setContainer_id(rs.getString("container_id"));
				   hm.setStart_time(rs.getString("start_time"));
				   hm.setFinish_time(rs.getString("finish_time"));
				   hm.setDuration(rs.getInt("duration"));
				   
				  _hbase_metrics.add(hm);
//				   String app_id = rs.getString("app_id");
//					String container_id = rs.getString("container_id");
//					String start_time = rs.getString("start_time");
//					String finish_time = rs.getString("finish_time");
//					int duration = rs.getInt("duration");
				  
					
//					System.out.println(app_id);
//					System.out.println(container_id);
//					System.out.println(start_time);
//					System.out.println(finish_time);
//					System.out.println(duration);
					
				   
			   }
//			   rs.close();
//			   st.close();
//			   con.close();	   
			}
		catch(SQLException se) {
			logger.error(se.getMessage());
			se.printStackTrace();
		}
		catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			con.close();
		}
		
		return _hbase_metrics;
		
	}
}


