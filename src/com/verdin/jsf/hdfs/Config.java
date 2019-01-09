package com.verdin.jsf.hdfs;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cluster_name",
    "stack_id"
})
public class Config {

    @JsonProperty("cluster_name")
    private String clusterName;
    @JsonProperty("stack_id")
    private String stackId;

    @JsonProperty("cluster_name")
    public String getClusterName() {
        return clusterName;
    }

    @JsonProperty("cluster_name")
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    @JsonProperty("stack_id")
    public String getStackId() {
        return stackId;
    }

    @JsonProperty("stack_id")
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Config.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clusterName");
        sb.append('=');
        sb.append(((this.clusterName == null)?"<null>":this.clusterName));
        sb.append(',');
        sb.append("stackId");
        sb.append('=');
        sb.append(((this.stackId == null)?"<null>":this.stackId));
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
        result = ((result* 31)+((this.clusterName == null)? 0 :this.clusterName.hashCode()));
        result = ((result* 31)+((this.stackId == null)? 0 :this.stackId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Config) == false) {
            return false;
        }
        Config rhs = ((Config) other);
        return (((this.clusterName == rhs.clusterName)||((this.clusterName!= null)&&this.clusterName.equals(rhs.clusterName)))&&((this.stackId == rhs.stackId)||((this.stackId!= null)&&this.stackId.equals(rhs.stackId))));
    }

}
