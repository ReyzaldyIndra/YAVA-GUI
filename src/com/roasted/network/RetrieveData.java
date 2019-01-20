package com.roasted.network;

public enum RetrieveData {

}
package com.verzinen.opgave8;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Cursor;
import org.apache.hadoop.hbase.client.Get;
//import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;


public class RetriveData {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, Exception {
		
		String hbaseHost = "yava3-132.labs247.com";  //"192.168.3.132";
		String 	zookeeperHost 	= "yava3-132.labs247.com"; //"192.168.3.132";
	
		
		// Instantiating Configuration class
		Configuration conf = HBaseConfiguration.create();
		
		
	    System.out.println("got conf  ... 1");
		
		conf.addResource(new Path("/app/etc/hbase/hbase-site.xml"));
		conf.addResource(new Path("/app/etc/hbase/ams-site.xml"));
		
		/*
		conf.setInt("timeout", 120000);
		conf.set("hbase.master",  hbaseHost + ":61300");
		conf.set("hbase.zookeeper.quorum",zookeeperHost);
		conf.set("hbase.zookeeper.property.clientPort", "2181");

		//conf.set("hbase.zookeeper.quorum", "hortonworks.hbase.vm");
		conf.set("zookeeper.znode.parent", "/hbase-unsecure");
		*/
		//conf.dumpDeprecatedKeys();
		System.out.println("got conf  ... 2");
				
		Connection connection = ConnectionFactory.createConnection(conf);
				
		System.out.println("got conn ...");
		
		// Instantiating HTable class
		//HTable table = new HTable(conf, "emp");
		
			
		Table table = connection.getTable(TableName.valueOf("CONTAINER_METRICS"));  //("emp"));

		System.out.println("got table  ... "+ table.getName());
		
		
		
		
		
		// Instantiating Get class
		Get g = new Get(Bytes.toBytes("2"));
		
		System.out.println("got Reading the data  ...");
				
		// Reading the data
		Result result = table.get(g);
		// Reading values from Result class object
		
		System.out.println("got Reading values from Result class object ... "+ result.getExists());
		
		Cursor c = result.getCursor();
		
		if (c ==  null ) System.out.println("cursor is null");
		
		byte[] value = result.getValue(Bytes.toBytes("START_TIME"), // personal data"),
				Bytes.toBytes("APP_ID"));//("name"));
		
		byte[] value1 = result.getValue(Bytes.toBytes("START_TIME"), // personal data"),
				Bytes.toBytes("APP_ID"));//("city"));
		
		// Printing the values
		String name = Bytes.toString(value);
		String city = Bytes.toString(value1);
		
		System.out.println("name: " + name +"  "+ "city: " + city);
		
		table.close();
	}
	
}
