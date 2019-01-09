package com.verdin.jsf.model;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;
//import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.verdin.jsf.model.HostDAO;

//import javax.enterprise.context.SessionScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.NormalScope;
import javax.faces.annotation.ManagedProperty;


//@ManagedBean(name="hostView")
//@ViewScoped

@Named("hostView")
@ConversationScoped
public class HostView implements Serializable {
	static final long serialVersionUID = 12345678913l;

    private List<Host> hosts;
    @Inject
    
    private HostDAO service;
 
    @PostConstruct
    public void init() {
    	try {
    		hosts = service.getHosts();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public List<Host> getHosts() {
        return hosts;
    }
 
    public void setService(HostDAO service) {
        this.service = service;
    }
}
