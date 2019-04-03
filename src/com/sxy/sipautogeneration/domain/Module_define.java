package com.sxy.sipautogeneration.domain;

import java.io.Serializable;

public class Module_define implements Serializable {

    /**
     * 模块编号
     */
    private Integer module_id;
    /**
     * 模块名称
     */
    private String module_name;
    /**
     * 上级模块
     */
    private Integer module_parent;
    /**
     * 层级
     */
    private String module_hierarchy;
    /**
     * 级别
     */
    private Integer module_level;
    /**
     * 图标名称
     */
    private String icon_name;
    /**
     * 对应链接
     */
    private String module_url;
    private String field1;
    private String field2;
    private String field3;

    public Integer getModule_id() {
        return module_id;
    }

    public void setModule_id(Integer module_id) {
        this.module_id = module_id;
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public Integer getModule_parent() {
        return module_parent;
    }

    public void setModule_parent(Integer module_parent) {
        this.module_parent = module_parent;
    }

    public String getModule_hierarchy() {
        return module_hierarchy;
    }

    public void setModule_hierarchy(String module_hierarchy) {
        this.module_hierarchy = module_hierarchy;
    }

    public Integer getModule_level() {
        return module_level;
    }

    public void setModule_level(Integer module_level) {
        this.module_level = module_level;
    }

    public String getIcon_name() {
        return icon_name;
    }

    public void setIcon_name(String icon_name) {
        this.icon_name = icon_name;
    }

    public String getModule_url() {
        return module_url;
    }

    public void setModule_url(String module_url) {
        this.module_url = module_url;
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
