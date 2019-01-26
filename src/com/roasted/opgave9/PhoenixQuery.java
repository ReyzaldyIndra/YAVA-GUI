package com.roasted.opgave9;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.PreparedStatement;



public class PhoenixQuery {
	 public static void main(String[] args) throws Exception {
		 
		  ResultSet rset = null;
		  //Connection con = DriverManager.getConnection("jdbc:phoenix:server:2181:/hbase-unsecure");
		  Connection conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure");
		    
		  PreparedStatement statement = conn.prepareStatement("select * from CONTAINER_METRICS");
		  rset = statement.executeQuery();
		  
		  while (rset.next()) {
			  
		   System.out.println(
				   rset.getString("APP_ID") +" | " +
				   rset.getString("CONTAINER_ID")+" | " +
				   rset.getString("START_TIME")+" | " +
				   rset.getString("FINISH_TIME")+" | " +
				   rset.getString("DURATION")+" | " +
				   rset.getString("MEM_USED_GB_AVG")
		   );
		   
		  }
		  
		  statement.close();
		  conn.close();
		 }
}
