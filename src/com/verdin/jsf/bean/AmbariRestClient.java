package com.verdin.jsf.bean;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class AmbariRestClient {
	
	String DEFAULT_USER = "admin";
	String DEFAULT_PASS = "admin";
	String DEFAUT_SERVICE =  "MAPREDUCE2";
	String CLUSTER = "YAVA30";// "H2SO4";
	String HOSTNAME = "192.168.3.132";//192.168.3.132  192.168.3.221 192.168.3.164

	
	
	public AmbariRestClient(String hostname, String cluster) {
		this.HOSTNAME = hostname;
		this.CLUSTER = cluster;
	}
	
	

	public String ambari_configurtion_rest_client (String service_name) throws Exception {
		  
		  String json =  null;  
		  
		  if (null == service_name || service_name.isEmpty() || "".equalsIgnoreCase(service_name))
			  service_name = DEFAUT_SERVICE;

		  
		  String hostname = HOSTNAME;
		  
			  /*
			 		Basic Auth with Raw HTTP Headers
			   * 
			   */

			  // curl -u admin:admin -H "X-Requested-By: ambari" -X GET http://192.168.3.132:6188/ws/v1/timeline/metrics/metadata


			  String URL_SECURED_BASIC_AUTHENTICATION = 
					  "http://"+ hostname +":6188/ws/v1/timeline/"+ CLUSTER +"/configurations/service_config_versions/?service_name="+ service_name;
		
			  // 		AMBARI_INFRA_SOLR, 		AMBARI_METRIC  	ATLAS  	HIVE  KAFKA  	MAPREDUCE2
			  //       	PIG  RANGER   SQOOP  YARN, ZOOKEEPER, OOZIE	
			  // 
			  //		"http://192.168.3.221:8080/api/v1/clusters/H2SO4/configurations/service_config_versions/?service_name=HBASE";
			  //		"http://192.168.3.221:8080/api/v1/clusters/H2SO4/configurations/service_config_versions/?service_name=TEZ";
			  //		"http://192.168.3.221:8080/api/v1/clusters/H2SO4/configurations/service_config_versions/?service_name=xxxxxxxx";


			  HttpHost targetHost = new HttpHost(hostname , 6188, "http");
			  CredentialsProvider credsProvider = new BasicCredentialsProvider();
			  credsProvider.setCredentials(AuthScope.ANY, 
					  new UsernamePasswordCredentials(DEFAULT_USER, DEFAULT_PASS));

			  AuthCache authCache = new BasicAuthCache();
			  authCache.put(targetHost, new BasicScheme());

			  // Add AuthCache to the execution context
			  final HttpClientContext context = HttpClientContext.create();
			  context.setCredentialsProvider(credsProvider);
			  context.setAuthCache(authCache);

			  HttpClient client = HttpClientBuilder.create().build();

			  HttpResponse response = client.execute(new HttpGet(URL_SECURED_BASIC_AUTHENTICATION), context);


			  int statusCode = response.getStatusLine().getStatusCode();
			  
			  System.out.println("----------------------------------------");

			  System.out.println("-- response code -- = "+ statusCode);


			  HttpEntity entity = response.getEntity();

			  System.out.println(response.getStatusLine());
			  
			  
			  Header[] headers = response.getAllHeaders();

			  for (int i = 0; i < headers.length; i++) {
				  System.out.println(headers[i]);
			  }

			  if (entity != null) {

				 json =     EntityUtils.toString(entity);
		
			  } 
			  
			  System.out.println("----------------------------------------");
			  
			  
			  return json;
		  }
}
