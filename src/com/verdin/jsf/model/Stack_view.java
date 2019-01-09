package com.verdin.jsf.model;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;
//import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.verdin.jsf.model.StackDAO;

import javax.enterprise.context.ConversationScoped;

@Named("stackView")
@ConversationScoped
public class Stack_view implements Serializable {
	static final long serialVersionUID = 12345678915l;
	
	private List<Stack> stacks;
	@Inject
	
	private StackDAO service;
	
	@PostConstruct
	public void init() {
		try {
			stacks = service.getStacks();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Stack> getStacks() {
		return stacks;
	}
	
	public void setService(StackDAO service) {
		this.service = service;
	}
	
	
}
