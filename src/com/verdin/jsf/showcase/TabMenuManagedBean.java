package com.verdin.jsf.showcase;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.jboss.logging.Logger;

@ManagedBean
@SessionScoped
public class TabMenuManagedBean {
	
    static Logger logger = Logger.getLogger(TabMenuManagedBean.class);

	private int index = 0;

	public int getIndex() {
		logger.info("index "+ index);
		return index;
	}

	public void setIndex(int index) {
		logger.info("set index "+ index);

		this.index = index;
	}

	public String doSomeWork(){
		logger.info("set index "+ index);

		// Do some work
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Some Work Achieved"));
		// Change the index that TabMenu refers as activated tab
		
		logger.info("Change the index that TabMenu refers as activated tab, i.e index = 1");

		index = 1;
		return "";
	}
}
