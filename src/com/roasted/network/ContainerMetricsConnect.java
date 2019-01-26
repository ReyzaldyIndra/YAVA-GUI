package com.roasted.network;



import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.HashSet;
//import java.util.Set;
//import java.sql.PreparedStatement;
//import java.sql.Connection;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Named;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;




//untuk setup koneksi dengan query Hbase

//@SuppressWarnings("serial")
@Named("metrics")
@ApplicationScoped
public class ContainerMetricsConnect{
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws IOException {
		
		// Instantiating Configuration class
		
		Configuration conf = HBaseConfiguration.create();
		
		System.out.println("got conf  ...");
		
		conf.addResource(new Path("/home/reyzaldy/git/YAVA-GUI/maven-project/hbase-site.xml"));
		conf.addResource(new Path("/home/reyzaldy/git/YAVA-GUI/maven-project/ams-site.xml"));
		
		Path p = new Path("/home/reyzaldy/git/YAVA-GUI/maven-project/hbase-site.xml");
		
		System.out.println("got "+ p.toString());		
		
		System.out.println("got conf  ... 2");		
		
		Connection connection = ConnectionFactory.createConnection(conf);
		
		 System.out.println("got conn ...");
		 		
		// Instantiating HTable class
		//HTable table = new HTable(config, "emp");
		
		Table table = connection.getTable(TableName.valueOf("CONTAINER_METRICS"));
		
		System.out.println("got table  ... ");
		
		
		// Instantiating the Scan class
		Scan scan = new Scan();
//		scan.addColumn("B@5119fb47", qualifier)
		// Scanning the required columns
	    ResultScanner scanner = table.getScanner(scan);
		
		// Getting the scan result
		// Reading values from scan result
		for (Result result = scanner.next(); result != null; result = scanner.next()) {
			
			System.out.println("Found row : " + result);
			String app_id =  Bytes.toString(result.getRow());
			System.out.println("Row : " + app_id);
//			System.out.println("Row : " + a);
//			System.out.println("result :" + result.getMap());
			for(Cell cell : result.listCells()) {
//				System.out.println(cell.getType());
//				System.out.println(cell);
//				System.out.println(cell.getValueArray().toString());
				String family = Bytes.toString(CellUtil.cloneFamily(cell));
				String qualifier = Bytes.toString(CellUtil.cloneQualifier(cell));
				
				System.out.println("Family : " + family);
				System.out.println("Qualifier : " + qualifier);
				
				long timeStamp = cell.getTimestamp();
				System.out.println("Timestamp: " + timeStamp);
			}
			
			
		// closing the scanner
		}
		scanner.close();
	}
}
