package com.alibaba.datax.plugin.writer.elasticsearchwriter;

import java.util.List;
import java.util.Objects;

/**
 * Created by xiongfeng.bxf on 17/3/2.
 */
public class ESColumn {

    private String name;//: "appkey",

    private String type;//": "TEXT",

    private String timezone;

    private String format;

    private Boolean array;

    private List<ESColumn> child;

    private Integer colNo;

    private Boolean ignore;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTimeZone(String timezone) {
        this.timezone = timezone;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getFormat() {
        return format;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Boolean isArray() {
        return array == null ? Boolean.FALSE : array;
    }

    public void setArray(Boolean array) {
        this.array = array;
    }

    public Boolean getArray() {
        return array;
    }

    public List<ESColumn> getChild() {
        return child;
    }

    public void setChild(List<ESColumn> child) {
        this.child = child;
    }

    public boolean hasChild() {
        return child != null && !child.isEmpty();
    }

    public Integer getColNo() {
        return colNo;
    }

    public void setColNo(Integer colNo) {
        this.colNo = colNo;
    }

    public Boolean getIgnore() {
        return ignore;
    }

    public void setIgnore(Boolean ignore) {
        this.ignore = ignore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ESColumn column = (ESColumn) o;
        return colNo == column.colNo &&
                Objects.equals(name, column.name) &&
                Objects.equals(type, column.type) &&
                Objects.equals(timezone, column.timezone) &&
                Objects.equals(format, column.format) &&
                Objects.equals(array, column.array) &&
                Objects.equals(child, column.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, timezone, format, array, child, colNo);
    }
}
