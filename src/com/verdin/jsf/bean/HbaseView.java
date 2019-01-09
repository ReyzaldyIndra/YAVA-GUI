package com.verdin.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.logging.Logger;

import com.verdin.jsf.model.Arraylist;
import com.verdin.jsf.model.Configuration;
import com.verdin.jsf.model.Item;
import com.verdin.jsf.model.POJOConfigurationResult;

@Named
@ViewScoped
public class HbaseView implements Serializable {
	
	static final long serialVersionUID = 1237l;
	
	static Logger logger = Logger.getLogger(HbaseView.class);
	
	POJOConfigurationResult _json_as_pojo;
	List<Item> items;
	
	static String DEFAULT_USER = "admin";
	static String DEFAULT_PASS = "admin";
	static String CLUSTER = "YAVA30";// "H2SO4";
	static String HOSTNAME = "192.168.3.132";//192.168.3.132  192.168.3.221 192.168.3.164
	
	  // 		AMBARI_INFRA_SOLR, 		AMBARI_METRIC  	ATLAS  	HIVE  KAFKA  	MAPREDUCE2
	  //       	PIG  RANGER   SQOOP  YARN, ZOOKEEPER, OOZIE	

	static String DEFAULT_SERVICE = "HBASE";
	
	Item _current_item ;
	List<Configuration> _current_configurations;
	Configuration config;
	
		
	@PostConstruct
	public  void init() throws Exception {
		
		
		AmbariRestClient _client  =  new AmbariRestClient(HOSTNAME, CLUSTER);
		  
		 String json =  _client.ambari_configurtion_rest_client (DEFAULT_SERVICE);
		  
		 _json_as_pojo = AmbariConfigurationUtil.json2pojo( json);
	
		 items = _json_as_pojo.getItems();    	
		 
		 System.out.println("items = "+ items.size());
		 
		 Item _current_item = items.stream()
    			 .filter(item -> item.getIsCurrent())
    			 .findAny()
    			 .orElse(null);
		 
		 _current_configurations = _current_item.getConfigurations();
		 
		 System.out.println("_current_configurations = "+ _current_configurations.size());
		 
		 config = getCurrentConfigurationByType("hbase-site");
		 		 		
	}
	
	public String   getType() {
	   	
	   	   return config.getType();
	    	   
		}
	
	public String   getTag() {
	   	
	   	   return config.getTag();
	    	   
		}
	
	public Integer   getVersion() {
	   	
	   	   return config.getVersion();
	    	   
		}
	
	public String   getClusterName() {
	   	
	   	   return config.getConfig().getClusterName();
	    	   
		}
	public String   getStackId() {
		
	   	   return config.getConfig().getStackId();
	    	   
		}
	
	public Map<String, Object >  getProperties(String type) {
		
			// String _type = "\"" + type +"\"";
		
		       Configuration cfg = getCurrentConfigurationByType(type);
		
	   	   return cfg.get_Properties();
	    	   
		}
	
	
	public List<String> getParameters(String type) {
		
		// String _type = "\"" + type +"\"";
	
	       Configuration cfg = getCurrentConfigurationByType(type);
	
   	   return cfg.set_Parameters();
    	   
	}
	
	public Map<String, Object >  getProperties() {
	   	
	   	   return config.get_Properties();
	    	   
		}
	
	public Map<String, Object>    getPropertiesAttributes() {
	   	
	   	   return config.get_PropertiesAttributes();
	    	   
		}
	
   private  Configuration  getCurrentConfigurationByType(String type) {
		
	   String _type = "\"" + type +"\"";
	   
		Configuration c  = _current_configurations.stream()
				 .filter(e -> _type.equalsIgnoreCase(e.getType()))
	   			 .findAny()
	   			 .orElse(null);
			
		
		return c;
	}
	
}
