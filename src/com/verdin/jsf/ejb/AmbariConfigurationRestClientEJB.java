package com.verdin.jsf.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
//import javax.faces.bean.ApplicationScoped;

//import org.apache.http.Header;
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

//import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.verdin.jsf.model.Config;
import com.verdin.jsf.model.Configuration;
import com.verdin.jsf.model.Item;
import com.verdin.jsf.model.JsonHbase;

import org.jboss.logging.Logger;

@ApplicationScoped
public class AmbariConfigurationRestClientEJB {
	
	static Logger logger = Logger.getLogger(AmbariConfigurationRestClientEJB.class);

	static String DEFAULT_USER = "admin";
	static String DEFAULT_PASS = "admin";

	  List<Item> _items = new ArrayList<Item>();
	  JsonHbase  _hbase =  new JsonHbase();
	
	
	
	//public static void main(String[] args) {
		
	@PostConstruct
	public  void init() {
		
		
	    try {
	   /*
			Basic Auth with Raw HTTP Headers
	   * 
	   */
	    	
	    	// curl -u admin:admin -H "X-Requested-By: ambari" -X GET  http://192.168.3.221:8080/api/v1/clusters/H2SO4/configurations?type=hive-site

	     	String URL_SECURED_BASIC_AUTHENTICATION = 
	     			"http://192.168.3.132:8080/api/v1/clusters/YAVA30/configurations/service_config_versions/?service_name=HBASE";
	     	
		//		"http://192.168.3.221:8080/api/v1/clusters/H2SO4/configurations/service_config_versions/?service_name=TEZ";
		//		"http://192.168.3.221:8080/api/v1/clusters/H2SO4/configurations/service_config_versions/?service_name=HDFS";
		//		"http://192.168.3.221:8080/api/v1/clusters/H2SO4/configurations/service_config_versions/?service_name=xxxxxxxx";

	     	
	     	HttpHost targetHost = new HttpHost("192.168.3.132", 8080, "http");
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
	    	
	      	
	    	//System.out.println("-- response code -- = "+ statusCode);
	    	logger.info("-- response code -- = "+ statusCode);
	      
	      HttpEntity entity = response.getEntity();
	      
	      if (entity != null) {
	    	  
	          String json =     EntityUtils.toString(entity);
	     	  
	          JsonParser parser = new JsonParser();
	          
	          JsonElement jsonTree = parser.parse(json);
	          
	          if(jsonTree.isJsonObject()){
	         	    JsonObject jsonObject = jsonTree.getAsJsonObject();

	         	    JsonElement href = jsonObject.get("href");
	         	   
	         	    
	         	    //System.out.println(href.toString());
	         	    logger.info(href.toString());
	         	    
	         	    _hbase.setHref(href.getAsString());
	         	  //  _hbase.setItems(items);
	         	    
	         	    // items
	          	    JsonArray ja = (JsonArray) parser.parse(jsonObject.get("items").toString());
	          	    
	          	  // System.out.println("items size = "+ ja.size());
	          	  logger.info("items size = "+ ja.size());
	         	    
	         	    for (JsonElement jo : ja) {
	         	        JsonObject j = (JsonObject) jo;
	         	        
	         	       // Your Code, Access json elements as j.get("some_element")
	          	        
	         	       String _href1 = j.get("href").toString();
	         	       String _cluster_name1 = j.get("cluster_name").toString();
	         	       /*
	 				      "createtime" : 1542014799815,
	 				      "group_id" : -1,
	 				      "group_name" : "Default",
	 				      "hosts" : [ ],
	 				      "is_cluster_compatible" : true,
	 				      "is_current" : true,
	 				      "service_config_version" : 10,
	 				      "service_config_version_note" : "Created from service config version V8",
	 				      "service_name" : "HBASE",
	 				      "stack_id" : "YAVA-3.0",
	 				      "user" : "admin"
	         	       */
	         	       
	         	       Item _item = new Item();
	         	       
	         	       _item.setClusterName(_cluster_name1);
	         	       _item.setHref(_href1);
	         	       _item.setCreatetime(j.get("createtime").getAsInt());
	         	    //   _item.setCreatetime(j.get("createtime").getAsString());
	         	       _item.setGroupId(j.get("group_id").getAsInt());
	         	       _item.setGroupName(j.get("group_name").getAsString());
	         	       _item.setIsCurrent(j.get("is_current").getAsBoolean());
	         	       _item.setIsClusterCompatible(j.get("is_cluster_compatible").getAsBoolean());
	         	       
	         	       _item.setServiceConfigVersion(j.get("service_config_version").getAsInt());
	         	       _item.setServiceConfigVersionNote(j.get("service_config_version_note").getAsString());
	         	       _item.setServiceName(j.get("service_name").getAsString());
	         	       
	         	      // _item.setStackId(stackId);
	         	      // _item.setUser(user);
	         	       
	         	      // _item.setConfigurations(configurations);
	         	      // _item.setHosts(hosts);
	         	       
	         	       // configurations
	         	       
	         	       JsonArray _confs = (JsonArray) j.get("configurations");
	         	       
	         	     //  JsonElement _conf = j.get("Config");
	         	       
	         	       List<Configuration> _configurations = new ArrayList<Configuration>();
	         	       
	         	     //  System.out.println("configurations size " +_confs.size());
	         	       logger.info("configurations size " +_confs.size());
	         	       
	         	       for (JsonElement _json_e : _confs) {
	         	    	   
	         	    	   Configuration c = new Configuration();
	         	    	 //  Config
	         	    	 //  type		: "hbase-atlas-application-properties",
	         	    	 //  tag		: "dee862d7-5ebc-40c2-9ed2-fc1ef17e66b4",
	         	    	 //  version
	         	    	 //  properties
	         	    	 //  properties_attributes
	         	    	   
	         	    	   
	         	    	   // Config
	         	    	   JsonObject _json_c = (JsonObject) _json_e;
	         	    	   JsonObject _config = (JsonObject) _json_c.get("Config");
	         	    	   String _cluster_name2 = _config.get("cluster_name").toString();
	         	    	   String _stack_id = _config.get("stack_id").toString(); 
	         	    	   
	         	    	   Config _conf = new Config();
	         	    	   
	         	    	   _conf.setClusterName(_cluster_name2);
	         	    	   _conf.setStackId(_stack_id);
	         	    	   
	         	    	   c.setConfig(_conf);
	         	    	   
	         	    	   String _type =_json_e.getAsJsonObject().get("type").toString();
	         	    	   String _tag =_json_e.getAsJsonObject().get("tag").toString();
	         	    	   int _version =_json_e.getAsJsonObject().get("version").getAsInt();
	         	    	   
	         	    	   c.setTag(_tag);
	         	    	   c.setVersion(_version);
	         	    	   c.setType(_type);
	         	    	   
	         	    	   
	         	    	//  properties
	           	    	   
	         	    	   JsonObject _properties = (JsonObject) _json_c.get("properties");
	         	    	   
	         	    	   Map<String, Object> _properties_as_map  =   toMap(_properties);
	         	    	   /*
	         	    	   for (String s: _properties_as_map.keySet()) {
	         	    		   
	         	    		   System.out.println(s +" :: "+ _properties_as_map.get(s));
	         	    		   
	         	    	   }  */
	         	    	   
	         	    	   c.set_Properties(_properties_as_map);
	         	    	   
	         	    	   
	        	    	//  properties_attributes
	           	    	   
	         	    	   JsonObject _properties_attr = (JsonObject) _json_c.get("properties_attributes");
	         	    	   
	         	    	   Map<String, Object> __properties_attr_as_map  =   toMap(_properties_attr);
	         	    	   
	         	    	   
	         	    	   c.set_PropertiesAttributes(__properties_attr_as_map);
	         	    	   
	         	    	  _configurations.add(c);
	         	    	  
	         	    	  
	         	    	   
	         	    	   // map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
	         	    	 
	         	    	   /*
	         	    	   for (String s: __properties_attr_as_map.keySet()) {
	         	    		   
	         	    		   System.out.println(s +" :: "+ __properties_as_map.get(s));
	         	    		   
	         	    	   }  */

	         	    	   /*
	         	    	   __properties_attr_as_map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
	         	    	   */
	         	    	   
	         	    	   _item.setConfigurations(_configurations);
	         	    	   
	         	       } // configurations
	         	       
	         	    // _item.setHosts(hosts);
	         	       JsonArray _hosts = (JsonArray) j.get("hosts");
	         	       //List<Object> hosts = new ArrayList<Object>();
	         	       List<Object> hosts =  toList(_hosts) ;
	         	       
	         	       _item.setHosts(hosts);
	         	       
	         	       _items.add(_item);
	         	
	         	 }
	         	    
	         	    _hbase.setItems(_items);

	         	}
	          
	       }
		    
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      // When HttpClient instance is no longer needed,
	      // shut down the connection manager to ensure
	      // immediate deallocation of all system resources
	      //httpclient.getConnectionManager().shutdown();
	    }
	    
	  }  // end init()
	
	
	public JsonHbase getJsonHbase() {
		return _hbase;
	}
	
	
	 public static Map<String, Object> toMap(JsonObject object) throws Exception {
		  
		    Map<String, Object> map = new HashMap<String, Object>();
		 
		    Set<String> keysItr = object.keySet();
		    
		 //   while(keysItr.) {
		    	
		    for (String key : keysItr) {
		        //String key = keysItr.next();
		    	
		        Object value = object.get(key);
		 
		        if(value instanceof JsonArray) {
		            value = toList((JsonArray) value);
		        }
		 
		        else if(value instanceof JsonObject) {
		            value = toMap((JsonObject) value);
		        }
		        map.put(key, value);
		    }
		    return map;
		}
	  
	  
	  public static List<Object> toList(JsonArray array) throws Exception {
		    List<Object> list = new ArrayList<Object>();
		    for(int i = 0; i < array.size(); i++) {
		        Object value = array.get(i);
		        if(value instanceof JsonArray) {
		            value = toList((JsonArray) value);
		        }
		 
		        else if(value instanceof JsonObject) {
		            value = toMap((JsonObject) value);
		        }
		        list.add(value);
		    }
		    return list;
		}
	
	

}
