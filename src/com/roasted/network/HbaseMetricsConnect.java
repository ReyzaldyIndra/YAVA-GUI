package com.roasted.network;


import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.ClusterConnection;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.util.Bytes;

//untuk setup koneksi dengan query Hbase


public class KueriHBase {

	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		    Configuration conf = new Configuration(true);
		   
		    conf.addResource(new Path("/app/etc/hbase/ams-hbase.xml"));
		    conf.addResource(new Path("/app/etc/hbase/hbase-site.xml"));
		    
		    Connection conn = ConnectionFactory.createConnection(conf);
		    
		    System.out.println("got conn ...");
		    
		    TableName tableName = TableName.valueOf("METRIC_AGGREGATE_DAILY_UUID");
		    
		    Table table = conn.getTable(tableName);
		    
		    Scan scan = new Scan();
		    
		    FilterList list = new FilterList(FilterList.Operator.MUST_PASS_ALL);
		    
		    
		    System.out.println("got conn ... 2");
		    
		  //  SingleColumnValueFilter cvFilter1 = new SingleColumnValueFilter("COLFAM1", 
		  //  		Bytes.toBytes("COL1"), CompareOp.EQUAL, Bytes.toBytes("YES"));
		    		
		    	// new SingleColumnValueFilter("COLFAM1", Bytes.toBytes("COL1"), 
		    	// CompareOp.EQUAL, Bytes.toBytes("YES"));
		    
		 //   cvFilter2.setFilterIfMissing(true);
		    
		  //  list.addFilter(cvFilter2);
		    
		  //  scan.addColumn("COLFAM1", Bytes.toBytes("COL1"));
		 //   scan.setFilter(list);
		    
		    ResultScanner rs = table.getScanner(scan);
		    
		    for (Result result : rs) {
		    	
		        for (Cell cell : result.listCells()) {
		        	
		            String qualifier = Bytes.toString(CellUtil.cloneQualifier(cell));
		            
		            String value = Bytes.toString(CellUtil.cloneValue(cell));
		            
		            System.out.printf("  Qualifier: [%s] : Value: [%s] ", qualifier, value);
		        }
		    }
		
	}
	
	

}


