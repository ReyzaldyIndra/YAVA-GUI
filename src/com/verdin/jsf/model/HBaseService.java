package com.verdin.jsf.model;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.verdin.jsf.ejb.HBaseRestClientEJB;
import org.jboss.logging.Logger;


@Named
@ViewScoped
public class HBaseService implements Serializable {
	static final long serialVersionUID = 1239l;
	 static Logger logger = Logger.getLogger(HBaseService.class);

	
	@Inject
	HBaseRestClientEJB service;
	
	JsonHbase  _hbase =  new JsonHbase();
	
	Item _current_item = null;
	
	List<Configuration> _current_confs = null;
	
	
	@PostConstruct
	public  void init() {
		_hbase = service.getJsonHbase();
		

		  List<Item> items = _hbase.getItems();    	
		  
		  logger.info("item size = "+  items.size());
    	 
	   	 _current_item = items.stream()
	   			 .filter(item -> item.getIsCurrent())
	   			 .findAny()
	   			 .orElse(null);
	   	 
	   	logger.info(_current_item.getServiceConfigVersionNote());
		logger.info(_current_item.getIsCurrent());
	   	
	  // 	_current_item.get
	   	 
	   	_current_confs = _current_item.getConfigurations();
	   	
	   	logger.info(_current_item.getServiceName());
	   	logger.info("_current_confs size = "+_current_confs.size());
		
	}
	
	public Item getCurrentItem() {
	   	
	   	   return _current_item;
	    	   
	}
	
	public  List<Configuration>  getCurrentConfiguration() {
   	
   	   return _current_confs;
    	   
	}
	
	public  Configuration  getCurrentConfigurationByType(String type) {
		
		Configuration c  = _current_confs.stream()
				 .filter(e -> type.equalsIgnoreCase(e.getType()))
	   			 .findAny()
	   			 .orElse(null);
			
		
		return c;
	}
	
	

}
