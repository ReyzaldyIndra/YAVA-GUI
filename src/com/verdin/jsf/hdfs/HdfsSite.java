package com.verdin.jsf.hdfs;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.logging.Logger;

@Named
@ViewScoped
public class HdfsSite implements Serializable {
	
	static final long serialVersionUID = 1234l;
	
	 static Logger logger = Logger.getLogger(HdfsSite.class);

	Configuration config;
	
	@Inject
	HdfsService  hdfs;
	
	@PostConstruct
	public  void init() {
		
		config = hdfs.getCurrentConfigurationByType("\"hdfs-site\"");
		logger.info(config.getType());
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
	
	public Map<String, Object >  getProperties() {
	   	
	   	   return config.get_Properties();
	    	   
		}
	
	public Map<String, Object>    getPropertiesAttributes() {
	   	
	   	   return config.get_PropertiesAttributes();
	    	   
		}
}
