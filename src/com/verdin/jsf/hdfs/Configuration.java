package com.verdin.jsf.hdfs;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Config",
    "type",
    "tag",
    "version",
    "properties",
    "properties_attributes"
})
public class Configuration {

    @JsonProperty("Config")
    private Config config;
    @JsonProperty("type")
    private String type;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("properties")
    private Properties properties;
    @JsonProperty("properties_attributes")
    private PropertiesAttributes propertiesAttributes;

    private Map<String, Object> _properties;
    private Map<String, Object> _propertiesAttributes;
    
    public Map<String, Object> get_Properties() {
        return _properties;
    }

    public void set_Properties(Map<String, Object>  properties_as_map) {
        this._properties  = properties_as_map ;
    }
    
    
    public Map<String, Object> get_PropertiesAttributes() {
        return _propertiesAttributes;
    }

    public void set_PropertiesAttributes(Map<String, Object>  _propertiesAttributes) {
        this._propertiesAttributes  = _propertiesAttributes ;
    }
    
    @JsonProperty("Config")
    public Config getConfig() {
        return config;
    }

    @JsonProperty("Config")
    public void setConfig(Config config) {
        this.config = config;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonProperty("properties_attributes")
    public PropertiesAttributes getPropertiesAttributes() {
        return propertiesAttributes;
    }

    @JsonProperty("properties_attributes")
    public void setPropertiesAttributes(PropertiesAttributes propertiesAttributes) {
        this.propertiesAttributes = propertiesAttributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Configuration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null)?"<null>":this.config));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
        sb.append(',');
        sb.append("propertiesAttributes");
        sb.append('=');
        sb.append(((this.propertiesAttributes == null)?"<null>":this.propertiesAttributes));
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
        result = ((result* 31)+((this.propertiesAttributes == null)? 0 :this.propertiesAttributes.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.config == null)? 0 :this.config.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Configuration) == false) {
            return false;
        }
        Configuration rhs = ((Configuration) other);
        return (((((((this.propertiesAttributes == rhs.propertiesAttributes)||((this.propertiesAttributes!= null)&&this.propertiesAttributes.equals(rhs.propertiesAttributes)))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.config == rhs.config)||((this.config!= null)&&this.config.equals(rhs.config))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

}
