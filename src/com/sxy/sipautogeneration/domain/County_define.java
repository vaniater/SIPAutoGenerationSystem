package com.sxy.sipautogeneration.domain;

import java.io.Serializable;

public class County_define implements Serializable {

    /**
     * 县市编号
     */
    private Integer county_id;
    /**
     * 县市名
     */
    private String county_name;
    /**
     * 县市编号
     */
    private String county_code;
    /**
     * 县市缩写名
     */
    private Integer county_shortname;
    private String field1;
    private String field2;
    private String field3;

    public Integer getCounty_id() {
        return county_id;
    }

    public void setCounty_id(Integer county_id) {
        this.county_id = county_id;
    }

    public String getCounty_name() {
        return county_name;
    }

    public void setCounty_name(String county_name) {
        this.county_name = county_name;
    }

    public String getCounty_code() {
        return county_code;
    }

    public void setCounty_code(String county_code) {
        this.county_code = county_code;
    }

    public Integer getCounty_shortname() {
        return county_shortname;
    }

    public void setCounty_shortname(Integer county_shortname) {
        this.county_shortname = county_shortname;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }
}
