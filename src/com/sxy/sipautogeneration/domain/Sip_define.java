package com.sxy.sipautogeneration.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;

public class Sip_define implements Serializable {
    /**
     * SIP ID编号
     */
    private Integer sip_id;
    /**
     * 对应的创建用户对象，用户编号
     */
    private User_info user_info;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Timestamp create_date;
    /**
     * 设备IP地址
     */
    private String sip_ip;
    /**
     * 设备密码
     */
    private String sip_pwd;
    /**
     * 设备名称
     */
    private String sip_name;
    /**
     * 设备地址
     */
    private String sip_addr;
    /**
     * 行政编号
     */
    private String sip_adminicode;
    /**
     * 区级编号
     */
    private String sip_districtcode;
    /**
     * 行业编码
     */
    private String sip_industycode;
    /**
     * 重点类型
     */
    private String sip_typecode;
    /**
     * 设备类型编号
     */
    private String sip_devicecode;
    /**
     * 接入单位编号
     */
    private String sip_accesscode;
    /**
     * 网络标识
     */
    private String sip_networkcode;
    /**
     * 序号
     */
    private String sip_serialcode;
    /**
     * SIP ID编码
     */
    private String sip_code;
    private String field1;
    private String field2;
    private String field3;

    public Integer getSip_id() {
        return sip_id;
    }

    public void setSip_id(Integer sip_id) {
        this.sip_id = sip_id;
    }

    public User_info getUser_info() {
        return user_info;
    }

    public void setUser_info(User_info user_info) {
        this.user_info = user_info;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public String getSip_ip() {
        return sip_ip;
    }

    public void setSip_ip(String sip_ip) {
        this.sip_ip = sip_ip;
    }

    public String getSip_pwd() {
        return sip_pwd;
    }

    public void setSip_pwd(String sip_pwd) {
        this.sip_pwd = sip_pwd;
    }

    public String getSip_name() {
        return sip_name;
    }

    public void setSip_name(String sip_name) {
        this.sip_name = sip_name;
    }

    public String getSip_addr() {
        return sip_addr;
    }

    public void setSip_addr(String sip_addr) {
        this.sip_addr = sip_addr;
    }

    public String getSip_adminicode() {
        return sip_adminicode;
    }

    public void setSip_adminicode(String sip_adminicode) {
        this.sip_adminicode = sip_adminicode;
    }

    public String getSip_districtcode() {
        return sip_districtcode;
    }

    public void setSip_districtcode(String sip_districtcode) {
        this.sip_districtcode = sip_districtcode;
    }

    public String getSip_industycode() {
        return sip_industycode;
    }

    public void setSip_industycode(String sip_industycode) {
        this.sip_industycode = sip_industycode;
    }

    public String getSip_typecode() {
        return sip_typecode;
    }

    public void setSip_typecode(String sip_typecode) {
        this.sip_typecode = sip_typecode;
    }

    public String getSip_devicecode() {
        return sip_devicecode;
    }

    public void setSip_devicecode(String sip_devicecode) {
        this.sip_devicecode = sip_devicecode;
    }

    public String getSip_accesscode() {
        return sip_accesscode;
    }

    public void setSip_accesscode(String sip_accesscode) {
        this.sip_accesscode = sip_accesscode;
    }

    public String getSip_networkcode() {
        return sip_networkcode;
    }

    public void setSip_networkcode(String sip_networkcode) {
        this.sip_networkcode = sip_networkcode;
    }

    public String getSip_serialcode() {
        return sip_serialcode;
    }

    public void setSip_serialcode(String sip_serialcode) {
        this.sip_serialcode = sip_serialcode;
    }

    public String getSip_code() {
        return sip_code;
    }

    public void setSip_code(String sip_code) {
        this.sip_code = sip_code;
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
