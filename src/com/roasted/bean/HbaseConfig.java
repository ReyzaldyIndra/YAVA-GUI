package com.roasted.bean;

import java.io.Serializable;
import java.io.File;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;	
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.util.Bytes;




@Named("hbase_config")
@SessionScoped
public class HbaseConfig implements Serializable{
	public void addResource(Configuration conf) throws IOException {
	conf = HBaseConfiguration.create();
	conf.addResource(new Path("/etc/ambari-metrics-collector/conf/hbase-site.xml"));
	
    Connection conn = ConnectionFactory.createConnection(conf);
    
    
    TableName tableName = TableName.valueOf("CONTAINER_METRICS");
    Table table = conn.getTable(tableName);
    Scan s = new Scan ();
    
    ResultScanner scanner = table.getScanner(s);

    for (Result result : scanner) {

        for (Cell cell : result.listCells()) {

            String qualifier = Bytes.toString(CellUtil.cloneQualifier(cell));

            String value = Bytes.toString(CellUtil.cloneValue(cell));

            System.out.printf("  Qualifier: [%s] : Value: [%s] ", qualifier, value);

        }

    }
	
	}
}



