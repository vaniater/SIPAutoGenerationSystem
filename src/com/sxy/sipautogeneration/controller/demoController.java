package com.sxy.sipautogeneration.controller;

import org.springframework.web.bind.annotation.RequestMapping;


public class demoController {

    /**
     * 登录界面
     */
    @RequestMapping("index")
    public String index(){
        return "login";
    }

    /**
     * 登录
     */
    @RequestMapping("login")
    public String login(){
        /**
         * do some thing
         */
        return "welcome";
    }

    /**
     * 添加设备
     */
    @RequestMapping("input-device")
    public String inputDevice(){
        /**
         * do some thing
         */
        return "addDevice";
    }

}


