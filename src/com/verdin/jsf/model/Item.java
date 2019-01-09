package com.verdin.jsf.model;


import java.util.ArrayList;
import java.util.List;

public class Item {

    private String href;
    private String clusterName;
    private List<Configuration> configurations = new ArrayList<Configuration>();
    private Integer createtime;
    private Integer groupId;
    private String groupName;
    private List<Object> hosts = new ArrayList<Object>();
    private Boolean isClusterCompatible;
    private Boolean isCurrent;
    private Integer serviceConfigVersion;
    private String serviceConfigVersionNote;
    private String serviceName;
    private String stackId;
    private String user;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public List<Configuration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<Configuration> configurations) {
        this.configurations = configurations;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Object> getHosts() {
        return hosts;
    }

    public void setHosts(List<Object> hosts) {
        this.hosts = hosts;
    }

    public Boolean getIsClusterCompatible() {
        return isClusterCompatible;
    }

    public void setIsClusterCompatible(Boolean isClusterCompatible) {
        this.isClusterCompatible = isClusterCompatible;
    }

    public Boolean getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    public Integer getServiceConfigVersion() {
        return serviceConfigVersion;
    }

    public void setServiceConfigVersion(Integer serviceConfigVersion) {
        this.serviceConfigVersion = serviceConfigVersion;
    }

    public String getServiceConfigVersionNote() {
        return serviceConfigVersionNote;
    }

    public void setServiceConfigVersionNote(String serviceConfigVersionNote) {
        this.serviceConfigVersionNote = serviceConfigVersionNote;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("clusterName");
        sb.append('=');
        sb.append(((this.clusterName == null)?"<null>":this.clusterName));
        sb.append(',');
        sb.append("configurations");
        sb.append('=');
        sb.append(((this.configurations == null)?"<null>":this.configurations));
        sb.append(',');
        sb.append("createtime");
        sb.append('=');
        sb.append(((this.createtime == null)?"<null>":this.createtime));
        sb.append(',');
        sb.append("groupId");
        sb.append('=');
        sb.append(((this.groupId == null)?"<null>":this.groupId));
        sb.append(',');
        sb.append("groupName");
        sb.append('=');
        sb.append(((this.groupName == null)?"<null>":this.groupName));
        sb.append(',');
        sb.append("hosts");
        sb.append('=');
        sb.append(((this.hosts == null)?"<null>":this.hosts));
        sb.append(',');
        sb.append("isClusterCompatible");
        sb.append('=');
        sb.append(((this.isClusterCompatible == null)?"<null>":this.isClusterCompatible));
        sb.append(',');
        sb.append("isCurrent");
        sb.append('=');
        sb.append(((this.isCurrent == null)?"<null>":this.isCurrent));
        sb.append(',');
        sb.append("serviceConfigVersion");
        sb.append('=');
        sb.append(((this.serviceConfigVersion == null)?"<null>":this.serviceConfigVersion));
        sb.append(',');
        sb.append("serviceConfigVersionNote");
        sb.append('=');
        sb.append(((this.serviceConfigVersionNote == null)?"<null>":this.serviceConfigVersionNote));
        sb.append(',');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
        sb.append(',');
        sb.append("stackId");
        sb.append('=');
        sb.append(((this.stackId == null)?"<null>":this.stackId));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.createtime == null)? 0 :this.createtime.hashCode()));
        result = ((result* 31)+((this.serviceConfigVersionNote == null)? 0 :this.serviceConfigVersionNote.hashCode()));
        result = ((result* 31)+((this.configurations == null)? 0 :this.configurations.hashCode()));
        result = ((result* 31)+((this.hosts == null)? 0 :this.hosts.hashCode()));
        result = ((result* 31)+((this.groupId == null)? 0 :this.groupId.hashCode()));
        result = ((result* 31)+((this.stackId == null)? 0 :this.stackId.hashCode()));
        result = ((result* 31)+((this.serviceName == null)? 0 :this.serviceName.hashCode()));
        result = ((result* 31)+((this.serviceConfigVersion == null)? 0 :this.serviceConfigVersion.hashCode()));
        result = ((result* 31)+((this.groupName == null)? 0 :this.groupName.hashCode()));
        result = ((result* 31)+((this.isCurrent == null)? 0 :this.isCurrent.hashCode()));
        result = ((result* 31)+((this.clusterName == null)? 0 :this.clusterName.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.isClusterCompatible == null)? 0 :this.isClusterCompatible.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return (((((((((((((((this.createtime == rhs.createtime)||((this.createtime!= null)&&this.createtime.equals(rhs.createtime)))&&((this.serviceConfigVersionNote == rhs.serviceConfigVersionNote)||((this.serviceConfigVersionNote!= null)&&this.serviceConfigVersionNote.equals(rhs.serviceConfigVersionNote))))&&((this.configurations == rhs.configurations)||((this.configurations!= null)&&this.configurations.equals(rhs.configurations))))&&((this.hosts == rhs.hosts)||((this.hosts!= null)&&this.hosts.equals(rhs.hosts))))&&((this.groupId == rhs.groupId)||((this.groupId!= null)&&this.groupId.equals(rhs.groupId))))&&((this.stackId == rhs.stackId)||((this.stackId!= null)&&this.stackId.equals(rhs.stackId))))&&((this.serviceName == rhs.serviceName)||((this.serviceName!= null)&&this.serviceName.equals(rhs.serviceName))))&&((this.serviceConfigVersion == rhs.serviceConfigVersion)||((this.serviceConfigVersion!= null)&&this.serviceConfigVersion.equals(rhs.serviceConfigVersion))))&&((this.groupName == rhs.groupName)||((this.groupName!= null)&&this.groupName.equals(rhs.groupName))))&&((this.isCurrent == rhs.isCurrent)||((this.isCurrent!= null)&&this.isCurrent.equals(rhs.isCurrent))))&&((this.clusterName == rhs.clusterName)||((this.clusterName!= null)&&this.clusterName.equals(rhs.clusterName))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.isClusterCompatible == rhs.isClusterCompatible)||((this.isClusterCompatible!= null)&&this.isClusterCompatible.equals(rhs.isClusterCompatible))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
