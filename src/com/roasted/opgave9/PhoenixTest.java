package com.roasted.opgave9;


import java.sql.*;
import java.util.*;
//import org.apache.phoenix.jdbc.PhoenixDriver;

public class PhoenixTest {
  public static void main(String args[]) throws Exception {
  
    Connection conn;
    Properties prop = new Properties();
    
//  connection = DriverManager.getConnection("jdbc:phoenix:localhost");
//  Class.forName("org.apache.phoenix.queryserver.client.Driver");
//  connection = DriverManager.getConnection("jdbc:phoenix:thin:url=http://localhost:8765;serialization=PROTOBUF");
// # Example: ./sqlline.py localhost:61181:/ams-hbase-unsecure
/*
For Phoenix Query Server, specify the JDBC URL in following format:
jdbc:phoenix:thin:url=scheme://server-hostname:port

For Apache Phoenix 4.7, specify the JDBC URL in following format:
jdbc:phoenix:zk_quorum:zk_port:zk_hbase_path
 * 
 */
    System.out.println("getting a connection");
    Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
   // conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:2181/hbase-unsecure");   // connect to zookeeper
   // conn = DriverManager.getConnection("jdbc:phoenix:thin:url=http://192.168.3.132:2181;serialization=PROTOBUF");  // connect to query server 
    
    conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure");
    
    System.out.println("got a connection");
    
    ResultSet rst = conn.createStatement().executeQuery("select * from CONTAINER_METRICS");
    
    while (rst.next()) {
    	
      System.out.println(rst.getString(1) + " | " + rst.getString(2) 
      			+" | " + rst.getString(3) + " | " + rst.getString(4));
      
      String fetchData_1 = rst.getString(1);
      String fetchData_2 = rst.getString(2);
      String fetchData_3 = rst.getString(3);
      String fetchData_4 = rst.getString(4);
      
      
    }
    
       conn.commit();
  }
}
