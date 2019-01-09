package com.verdin.jsf.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.verdin.jsf.model.Config;
import com.verdin.jsf.model.Configuration;
import com.verdin.jsf.model.Item;
import com.verdin.jsf.model.POJOConfigurationResult;


public class AmbariConfigurationUtil {
	
	
	  public static POJOConfigurationResult json2pojo(String json) throws Exception {
		  
		  
		  POJOConfigurationResult  _hbase =  new POJOConfigurationResult();
		  List<Item> _items = new ArrayList<Item>();
		  
	      JsonParser parser = new JsonParser();
	      
	      JsonElement jsonTree = parser.parse(json);
	       
	       if(jsonTree.isJsonObject()) {
	      	    JsonObject jsonObject = jsonTree.getAsJsonObject();

	      	    JsonElement href = jsonObject.get("href");
	      	    
	      	    System.out.println(href.toString());
	      	    
	      	    
	      	    _hbase.setHref(href.getAsString());
	      	  //  _hbase.setItems(items);
	      	    
	      	    // items
	       	    JsonArray ja = (JsonArray) parser.parse(jsonObject.get("items").toString());
	       	    
	       	   System.out.println("items size = "+ ja.size());
	           	    
	      	    for (JsonElement jo : ja) {
	      	        JsonObject j = (JsonObject) jo;
	      	        
	      	       // Your Code, Access json elements as j.get("some_element")
	      	        // Item 
	       	        
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
	      	       
	      	       _item.setStackId(j.get("stack_id").getAsString());
	      	       _item.setUser(j.get("user").getAsString());
	      	       
	      	      // _item.setConfigurations(configurations);
	      	      // _item.setHosts(hosts);
	      	       
	      	       // configurations
	      	       
	      	       JsonArray _confs = (JsonArray) j.get("configurations");
	      	       
	      	     //  JsonElement _conf = j.get("Config");
	      	       
	      	       List<Configuration> _configurations = new ArrayList<Configuration>();
	      	       
	      	       //System.out.println("configurations size " +_confs.size());
	      	       
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
	      	    		   
	      	    	   } */
	      	    	   
	      	    	   
	      	    	   
	      	    	   c.set_Properties(_properties_as_map);
	      	    	   
	      	    	 //  System.out.println("_properties_as_map size = "+ _properties_as_map.size());
	      	    	   
	      	    	   
	     	    	//  properties_attributes
	        	    	   
	      	    	   JsonObject _properties_attr = (JsonObject) _json_c.get("properties_attributes");
	      	    	   
	      	    	   Map<String, Object> __properties_attr_as_map  =   toMap(_properties_attr);
	      	    	   
	      	    	   
	      	    	   c.set_PropertiesAttributes(__properties_attr_as_map);
	      	    	   
	      	    	   
	      	    	  // System.out.println("__properties_attr_as_map size = "+ __properties_attr_as_map.size());
	      	    	   
	      	    	   
	      	    	   // map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
	      	    	 
	      	    	   /*
	      	    	   for (String s: __properties_attr_as_map.keySet()) {
	      	    		   
	      	    		   System.out.println(s +" :: "+ __properties_as_map.get(s));
	      	    		   
	      	    	   }  */

	      	    	  // __properties_attr_as_map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
	      	    	   
	      	    	   _configurations.add(c);
	      	    	   
	      	    	   _item.setConfigurations(_configurations);
	      	    	   
	      	       } // configurations
	      	       
	      	    // _item.setHosts(hosts);
	      	       JsonArray _hosts = (JsonArray) j.get("hosts");
	      	       //List<Object> hosts = new ArrayList<Object>();
	      	       List<Object> hosts =  toList(_hosts) ;
	      	       
	      	       _item.setHosts(hosts);
	      	       
	      	       
	      	       // collect item
	      	       
	      	       _items.add(_item);
	      	
	      	 }
	      	    
	      	    _hbase.setItems(_items);
	      	    
	       }
	       
	       
	       return _hbase;
	  }
	  
	
	  
	  public static Configuration findByType (
			  String type, List<Configuration> _configurations) {
		  
		  
		  System.out.println(type);
		  
			    Iterator<Configuration> iterator = _configurations.iterator();
			    
			    while (iterator.hasNext()) {
			    	Configuration cfg = iterator.next();
			    	System.out.println(cfg.getType());
			    	
			        if (type.equals(cfg.getType())) {
			        	System.out.println(cfg.getType());
			            return cfg;
			        }
			        
			    }
			    
			    
			    return null;
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
