package com.sxy.sipautogeneration.domain;

import java.io.Serializable;

public class User_info implements Serializable {

    /**
     * 用户编号
     */
    private Integer user_id;
    /**
     * 登录名
     */
    private String user_name;
    /**
     * 密码
     */
    private String login_password;
    /**
     * 角色对象，所属角色编号role_id
     */
    private Role_define role_define;
    /**
     * 所属县市对象，县市编号county_id
     */
    private County_define county_define;
    /**
     * 是否在线
     */
    private Integer if_online;
    /**
     * 是否锁定
     */
    private Integer is_locked;
    /**
     * 手机号码
     */
    private String user_mobile;
    /**
     * 电子邮箱
     */
    private String user_email;
    private String field1;
    private String field2;
    private String field3;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }

    public Role_define getRole_define() {
        return role_define;
    }

    public void setRole_define(Role_define role_define) {
        this.role_define = role_define;
    }

    public County_define getCounty_define() {
        return county_define;
    }

    public void setCounty_define(County_define county_define) {
        this.county_define = county_define;
    }

    public Integer getIf_online() {
        return if_online;
    }

    public void setIf_online(Integer if_online) {
        this.if_online = if_online;
    }

    public Integer getIs_locked() {
        return is_locked;
    }

    public void setIs_locked(Integer is_locked) {
        this.is_locked = is_locked;
    }

    public String getUser_mobile() {
        return user_mobile;
    }

    public void setUser_mobile(String user_mobile) {
        this.user_mobile = user_mobile;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
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
