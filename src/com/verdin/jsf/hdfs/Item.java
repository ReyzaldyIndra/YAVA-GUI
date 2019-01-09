package com.verdin.jsf.hdfs;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "href",
    "cluster_name",
    "configurations",
    "createtime",
    "group_id",
    "group_name",
    "hosts",
    "is_cluster_compatible",
    "is_current",
    "service_config_version",
    "service_config_version_note",
    "service_name",
    "stack_id",
    "user"
})
public class Item {

    @JsonProperty("href")
    private String href;
    @JsonProperty("cluster_name")
    private String clusterName;
    @JsonProperty("configurations")
    private List<Configuration> configurations = new ArrayList<Configuration>();
    @JsonProperty("createtime")
    private Integer createtime;
    @JsonProperty("group_id")
    private Integer groupId;
    @JsonProperty("group_name")
    private String groupName;
    @JsonProperty("hosts")
    private List<Object> hosts = new ArrayList<Object>();
    @JsonProperty("is_cluster_compatible")
    private Boolean isClusterCompatible;
    @JsonProperty("is_current")
    private Boolean isCurrent;
    @JsonProperty("service_config_version")
    private Integer serviceConfigVersion;
    @JsonProperty("service_config_version_note")
    private String serviceConfigVersionNote;
    @JsonProperty("service_name")
    private String serviceName;
    @JsonProperty("stack_id")
    private String stackId;
    @JsonProperty("user")
    private String user;

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("cluster_name")
    public String getClusterName() {
        return clusterName;
    }

    @JsonProperty("cluster_name")
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    @JsonProperty("configurations")
    public List<Configuration> getConfigurations() {
        return configurations;
    }

    @JsonProperty("configurations")
    public void setConfigurations(List<Configuration> configurations) {
        this.configurations = configurations;
    }

    @JsonProperty("createtime")
    public Integer getCreatetime() {
        return createtime;
    }

    @JsonProperty("createtime")
    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    @JsonProperty("group_id")
    public Integer getGroupId() {
        return groupId;
    }

    @JsonProperty("group_id")
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("group_name")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("group_name")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("hosts")
    public List<Object> getHosts() {
        return hosts;
    }

    @JsonProperty("hosts")
    public void setHosts(List<Object> hosts) {
        this.hosts = hosts;
    }

    @JsonProperty("is_cluster_compatible")
    public Boolean getIsClusterCompatible() {
        return isClusterCompatible;
    }

    @JsonProperty("is_cluster_compatible")
    public void setIsClusterCompatible(Boolean isClusterCompatible) {
        this.isClusterCompatible = isClusterCompatible;
    }

    @JsonProperty("is_current")
    public Boolean getIsCurrent() {
        return isCurrent;
    }

    @JsonProperty("is_current")
    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    @JsonProperty("service_config_version")
    public Integer getServiceConfigVersion() {
        return serviceConfigVersion;
    }

    @JsonProperty("service_config_version")
    public void setServiceConfigVersion(Integer serviceConfigVersion) {
        this.serviceConfigVersion = serviceConfigVersion;
    }

    @JsonProperty("service_config_version_note")
    public String getServiceConfigVersionNote() {
        return serviceConfigVersionNote;
    }

    @JsonProperty("service_config_version_note")
    public void setServiceConfigVersionNote(String serviceConfigVersionNote) {
        this.serviceConfigVersionNote = serviceConfigVersionNote;
    }

    @JsonProperty("service_name")
    public String getServiceName() {
        return serviceName;
    }

    @JsonProperty("service_name")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @JsonProperty("stack_id")
    public String getStackId() {
        return stackId;
    }

    @JsonProperty("stack_id")
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
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
