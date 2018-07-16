package com.sxy.sipautogeneration.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    public static String[] LOGIN = {"/SIPAutoGenerationSystem/login","/SIPAutoGenerationSystem/index"};
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
        //System.out.println("req.getServletPath()"+req.getServletPath());
        for (String s: LOGIN) {
            if (req.getRequestURI().equals(s)){
                return true;
            }
        }
        Object usr = req.getSession().getAttribute("user");
        if(usr == null){
            res.sendRedirect("/index.jsp");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
