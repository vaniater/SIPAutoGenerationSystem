package com.sxy.sipautogeneration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demoController {

    /**
     * 欢迎界面
     */
    @RequestMapping("index")
    public String login(){
        return "redirect:/index.jsp";
    }
}
