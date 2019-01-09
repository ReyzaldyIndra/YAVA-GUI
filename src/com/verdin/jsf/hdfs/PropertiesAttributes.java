package com.verdin.jsf.hdfs;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "final"
})
public class PropertiesAttributes {

    @JsonProperty("final")
    private Final _final;

    @JsonProperty("final")
    public Final getFinal() {
        return _final;
    }

    @JsonProperty("final")
    public void setFinal(Final _final) {
        this._final = _final;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PropertiesAttributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_final");
        sb.append('=');
        sb.append(((this._final == null)?"<null>":this._final));
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
        result = ((result* 31)+((this._final == null)? 0 :this._final.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PropertiesAttributes) == false) {
            return false;
        }
        PropertiesAttributes rhs = ((PropertiesAttributes) other);
        return ((this._final == rhs._final)||((this._final!= null)&&this._final.equals(rhs._final)));
    }

}
