package com.verdin.jsf.hdfs;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fs.defaultFS",
    "dfs.webhdfs.enabled",
    "dfs.namenode.http-address",
    "dfs.namenode.name.dir",
    "dfs.datanode.failed.volumes.tolerated",
    "dfs.datanode.data.dir"
})
public class Final {

    @JsonProperty("fs.defaultFS")
    private String fsDefaultFS;
    @JsonProperty("dfs.webhdfs.enabled")
    private String dfsWebhdfsEnabled;
    @JsonProperty("dfs.namenode.http-address")
    private String dfsNamenodeHttpAddress;
    @JsonProperty("dfs.namenode.name.dir")
    private String dfsNamenodeNameDir;
    @JsonProperty("dfs.datanode.failed.volumes.tolerated")
    private String dfsDatanodeFailedVolumesTolerated;
    @JsonProperty("dfs.datanode.data.dir")
    private String dfsDatanodeDataDir;

    @JsonProperty("fs.defaultFS")
    public String getFsDefaultFS() {
        return fsDefaultFS;
    }

    @JsonProperty("fs.defaultFS")
    public void setFsDefaultFS(String fsDefaultFS) {
        this.fsDefaultFS = fsDefaultFS;
    }

    @JsonProperty("dfs.webhdfs.enabled")
    public String getDfsWebhdfsEnabled() {
        return dfsWebhdfsEnabled;
    }

    @JsonProperty("dfs.webhdfs.enabled")
    public void setDfsWebhdfsEnabled(String dfsWebhdfsEnabled) {
        this.dfsWebhdfsEnabled = dfsWebhdfsEnabled;
    }

    @JsonProperty("dfs.namenode.http-address")
    public String getDfsNamenodeHttpAddress() {
        return dfsNamenodeHttpAddress;
    }

    @JsonProperty("dfs.namenode.http-address")
    public void setDfsNamenodeHttpAddress(String dfsNamenodeHttpAddress) {
        this.dfsNamenodeHttpAddress = dfsNamenodeHttpAddress;
    }

    @JsonProperty("dfs.namenode.name.dir")
    public String getDfsNamenodeNameDir() {
        return dfsNamenodeNameDir;
    }

    @JsonProperty("dfs.namenode.name.dir")
    public void setDfsNamenodeNameDir(String dfsNamenodeNameDir) {
        this.dfsNamenodeNameDir = dfsNamenodeNameDir;
    }

    @JsonProperty("dfs.datanode.failed.volumes.tolerated")
    public String getDfsDatanodeFailedVolumesTolerated() {
        return dfsDatanodeFailedVolumesTolerated;
    }

    @JsonProperty("dfs.datanode.failed.volumes.tolerated")
    public void setDfsDatanodeFailedVolumesTolerated(String dfsDatanodeFailedVolumesTolerated) {
        this.dfsDatanodeFailedVolumesTolerated = dfsDatanodeFailedVolumesTolerated;
    }

    @JsonProperty("dfs.datanode.data.dir")
    public String getDfsDatanodeDataDir() {
        return dfsDatanodeDataDir;
    }

    @JsonProperty("dfs.datanode.data.dir")
    public void setDfsDatanodeDataDir(String dfsDatanodeDataDir) {
        this.dfsDatanodeDataDir = dfsDatanodeDataDir;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Final.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsDefaultFS");
        sb.append('=');
        sb.append(((this.fsDefaultFS == null)?"<null>":this.fsDefaultFS));
        sb.append(',');
        sb.append("dfsWebhdfsEnabled");
        sb.append('=');
        sb.append(((this.dfsWebhdfsEnabled == null)?"<null>":this.dfsWebhdfsEnabled));
        sb.append(',');
        sb.append("dfsNamenodeHttpAddress");
        sb.append('=');
        sb.append(((this.dfsNamenodeHttpAddress == null)?"<null>":this.dfsNamenodeHttpAddress));
        sb.append(',');
        sb.append("dfsNamenodeNameDir");
        sb.append('=');
        sb.append(((this.dfsNamenodeNameDir == null)?"<null>":this.dfsNamenodeNameDir));
        sb.append(',');
        sb.append("dfsDatanodeFailedVolumesTolerated");
        sb.append('=');
        sb.append(((this.dfsDatanodeFailedVolumesTolerated == null)?"<null>":this.dfsDatanodeFailedVolumesTolerated));
        sb.append(',');
        sb.append("dfsDatanodeDataDir");
        sb.append('=');
        sb.append(((this.dfsDatanodeDataDir == null)?"<null>":this.dfsDatanodeDataDir));
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
        result = ((result* 31)+((this.fsDefaultFS == null)? 0 :this.fsDefaultFS.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeHttpAddress == null)? 0 :this.dfsNamenodeHttpAddress.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeDataDir == null)? 0 :this.dfsDatanodeDataDir.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeNameDir == null)? 0 :this.dfsNamenodeNameDir.hashCode()));
        result = ((result* 31)+((this.dfsWebhdfsEnabled == null)? 0 :this.dfsWebhdfsEnabled.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeFailedVolumesTolerated == null)? 0 :this.dfsDatanodeFailedVolumesTolerated.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Final) == false) {
            return false;
        }
        Final rhs = ((Final) other);
        return (((((((this.fsDefaultFS == rhs.fsDefaultFS)||((this.fsDefaultFS!= null)&&this.fsDefaultFS.equals(rhs.fsDefaultFS)))&&((this.dfsNamenodeHttpAddress == rhs.dfsNamenodeHttpAddress)||((this.dfsNamenodeHttpAddress!= null)&&this.dfsNamenodeHttpAddress.equals(rhs.dfsNamenodeHttpAddress))))&&((this.dfsDatanodeDataDir == rhs.dfsDatanodeDataDir)||((this.dfsDatanodeDataDir!= null)&&this.dfsDatanodeDataDir.equals(rhs.dfsDatanodeDataDir))))&&((this.dfsNamenodeNameDir == rhs.dfsNamenodeNameDir)||((this.dfsNamenodeNameDir!= null)&&this.dfsNamenodeNameDir.equals(rhs.dfsNamenodeNameDir))))&&((this.dfsWebhdfsEnabled == rhs.dfsWebhdfsEnabled)||((this.dfsWebhdfsEnabled!= null)&&this.dfsWebhdfsEnabled.equals(rhs.dfsWebhdfsEnabled))))&&((this.dfsDatanodeFailedVolumesTolerated == rhs.dfsDatanodeFailedVolumesTolerated)||((this.dfsDatanodeFailedVolumesTolerated!= null)&&this.dfsDatanodeFailedVolumesTolerated.equals(rhs.dfsDatanodeFailedVolumesTolerated))));
    }

}
