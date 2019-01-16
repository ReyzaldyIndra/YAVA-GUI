package com.roasted.network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.Serializable;
import java.util.List;

import org.jboss.logging.Logger;

import com.roasted.model.HbaseMetrics;

public class HbaseMetricsConnect implements Serializable {
	
	static Logger logger = Logger.getLogger(HbaseMetricsConnect.class);
		
		String url = "jdbc:phoenix:localhost:61181:/ams-hbase-un";
		
		public List<HbaseMetrics> getMetrics() throws Exception{
		
		List<HbaseMetrics> _hbase_metrics = new ArrayList<HbaseMetrics>();
		String container_metrics = "select * from CONTAINER_METRICS";
		
		Connection con;
		Statement st;
		ResultSet rs;
		try {
			   Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
			   con = DriverManager.getConnection(url);
			   
			   st = con.createStatement();
			   rs = st.executeQuery(container_metrics);
			   
			   while(rs.next()) {
				   String data = rs.getString(1);
				   System.out.println(data);
				   
				   HbaseMetrics hm = new HbaseMetrics();
				   
				   hm.setApp_id(rs.getString("app_id"));
				   hm.setContainer_id(rs.getString("container_id"));
				   hm.setStart_time(rs.getString("start_time"));
				   hm.setFinish_time(rs.getString("finish_time"));
				   hm.setDuration(rs.getInt("duration"));
				   
				   _hbase_metrics.add(hm);
				   
			   }
//			   rs.close();
//			   st.close();
			   
			}
			catch(ClassNotFoundException ex) {
			   System.out.println("Error: unable to load driver class!");
			   System.exit(1);
			} finally {
				con.close();
			}
		
	}
}


}