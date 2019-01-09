package com.verdin.jsf.model;

import org.primefaces.model.menu.*;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@ViewScoped
public class TabBean {
    private List<TabInfo> tabs;

    @PostConstruct
    public void init() {
          tabs = Arrays.asList(new TabInfo("DataTable", "datatabel"),
                  new TabInfo("Reviews", "reviews"),
                  new TabInfo("TreeTable", "treetabel"),
                  new TabInfo("OnDemand", "ondemand"),
                  new TabInfo("CPU Usage", "cpuusage"),
                  new TabInfo("Bread Crump", "bread-crump"),
                  new TabInfo("PagedTable", "pagination")
                  );
    }

    public List<TabInfo> getTabs() {
        return tabs;
    }
}