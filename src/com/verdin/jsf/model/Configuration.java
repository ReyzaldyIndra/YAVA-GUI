package com.verdin.jsf.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Configuration {

    private Config config;
    private String type;
    private String tag;
    private Integer version;
    private Properties properties;
    private PropertiesAttributes propertiesAttributes;

    private Map<String, Object> _properties;
    private Map<String, Object> _propertiesAttributes;
    private Arraylist parameters;
    
    public Map<String, Object> get_Properties() {
        return _properties;
    }

    public Map<String, Object> set_Properties(Map<String, Object>  properties_as_map) {
        return _properties  = properties_as_map;
    }
    
    public List<String> set_Parameters() {
		return (List<String>) (_properties =  (Map<String, Object>) parameters);
	}
    
    private List<String> list(Collection<Object> values) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> get_PropertiesAttributes() {
        return _propertiesAttributes;
    }

    public void set_PropertiesAttributes(Map<String, Object>  _propertiesAttributes) {
        this._propertiesAttributes  = _propertiesAttributes ;
    }
    
    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
/*
    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public PropertiesAttributes getPropertiesAttributes() {
        return propertiesAttributes;
    }

    public void setPropertiesAttributes(PropertiesAttributes propertiesAttributes) {
        this.propertiesAttributes = propertiesAttributes;
    }
*/
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
