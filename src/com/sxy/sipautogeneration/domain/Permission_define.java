package com.sxy.sipautogeneration.domain;

import java.io.Serializable;

public class Permission_define implements Serializable {

    /**
     * Permission编号
     */
    public Integer permission_id;

    /**
     * ，角色定义对象，角色定义编号role_id
     */
    private Role_define role_define;
    /**
     * 模块定义对象,模块标识module_id
     */
    private Module_define module_define;
    /**
     * 操作权限
     */
    private Integer crud_operation;
    private String field1;
    private String field2;
    private String field3;

    public Integer getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(Integer permission_id) {
        this.permission_id = permission_id;
    }

    public Role_define getRole_define() {
        return role_define;
    }

    public void setRole_define(Role_define role_define) {
        this.role_define = role_define;
    }

    public Module_define getModule_define() {
        return module_define;
    }

    public void setModule_define(Module_define module_define) {
        this.module_define = module_define;
    }

    public Integer getCrud_operation() {
        return crud_operation;
    }

    public void setCrud_operation(Integer crud_operation) {
        this.crud_operation = crud_operation;
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
