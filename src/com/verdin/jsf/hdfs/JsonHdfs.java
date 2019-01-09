package com.verdin.jsf.hdfs;


import java.util.ArrayList;
import java.util.List;

public class JsonHdfs {

    private String href;
    private List<Item> items = new ArrayList<Item>();

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JsonHdfs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
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
        result = ((result* 31)+((this.items == null)? 0 :this.items.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JsonHdfs) == false) {
            return false;
        }
        JsonHdfs rhs = ((JsonHdfs) other);
        return (((this.items == rhs.items)||((this.items!= null)&&this.items.equals(rhs.items)))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))));
    }

}
