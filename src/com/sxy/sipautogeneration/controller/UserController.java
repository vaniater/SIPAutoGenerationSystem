package com.sxy.sipautogeneration.controller;

import com.sxy.sipautogeneration.domain.User_info;
import com.sxy.sipautogeneration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    /**
     * 登录界面
     */
    @RequestMapping("index")
    public String index(){
        return "login";
    }

    /**
     * 用户登录
     */
    @RequestMapping("login")
    public ModelAndView login(@RequestParam("name") String name, @RequestParam("pwd") String pwd, HttpSession session,
                              ModelAndView modelAndView){
        User_info user = userService.login(name,pwd);
        if (user != null){
            session.setAttribute("user_session",user);
            modelAndView.setViewName("redirect:/welcome");
        }else{
            modelAndView.addObject("message","登录失败！账号或密码错误。");
            modelAndView.setViewName("forword:/login");
        }
        return modelAndView;
    }

    /**
     * 管理员添加用户
     */
    @RequestMapping("input-user")
    public ModelAndView inputUser(@ModelAttribute User_info user,ModelAndView modelAndView){
        userService.updateUser(user);
        modelAndView.setViewName("redirect:/welcome");
        /*return "addDevice";*/
        return modelAndView;
    }

    /**
     * 修改用户信息
     */
    @RequestMapping("update-user")
    public ModelAndView manageUser(@ModelAttribute User_info user, ModelAndView modelAndView){
        userService.updateUser(user);
        modelAndView.setViewName("redirect:/welome");
        /*return "manageDevice";*/
        return modelAndView;
    }
}
