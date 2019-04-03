package com.sxy.sipautogeneration.controller;

import com.sxy.sipautogeneration.domain.Sip_define;
import com.sxy.sipautogeneration.domain.User_info;
import com.sxy.sipautogeneration.service.SipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SipController {

    @Autowired
    @Qualifier("sipService")
    private SipService sipService;

    /**
     * 管理设备界面
     */
    @RequestMapping("manage-device")
    public String manageDevice(){
        return "manageDevice";
    }

    /**
     * 添加设备界面
     * @return jsp界面
     */
    @RequestMapping("input-device")
    public String addDevice(){
        return  "addDevice";
    }

    /**
     * 查询设备
     * @return
     */
    @RequestMapping("list-device")
    public String findDevice(Model model){
        List<Sip_define> sip_defines = sipService.findall();
        model.addAttribute("sip_defines",sip_defines);
        return "welcome";
    }

    /**
     * 添加设备SIP信息
     * @return 添加结果信息
     */
    @RequestMapping("input-device")
    public ModelAndView inputDevice(@ModelAttribute Sip_define sip,ModelAndView modelAndView){
        sipService.saveSip(sip);
        modelAndView.addObject("msessage","添加成功！");
        modelAndView.setViewName("redirect:/addDevice");
        return modelAndView;
    }

    /**
     * 更新SIP信息
     * @return 更新结果信息
     */
    @RequestMapping("update-device")
    public ModelAndView updateDevice(@ModelAttribute Sip_define sip,ModelAndView modelAndView){
        sipService.updateSip(sip);
        modelAndView.addObject("message","更新成功！");
        modelAndView.setViewName("redirect:/manageDevice");
        return modelAndView;
    }

}
