package com.sxy.sipautogeneration.domain;

import java.io.Serializable;

public class Role_define implements Serializable {

    /**
     * 角色编号
     */
    private Integer roel_id;
    /**
     * 角色名称
     */
    private String role_name;
    /**
     * 角色描述
     */
    private String role_description;
    /**
     * 角色权限等级
     */
    private Integer role_priv_level;
    private String field1;
    private String field2;
    private String field3;

    public Integer getRoel_id() {
        return roel_id;
    }

    public void setRoel_id(Integer roel_id) {
        this.roel_id = roel_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_description() {
        return role_description;
    }

    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }

    public Integer getRole_priv_level() {
        return role_priv_level;
    }

    public void setRole_priv_level(Integer role_priv_level) {
        this.role_priv_level = role_priv_level;
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
