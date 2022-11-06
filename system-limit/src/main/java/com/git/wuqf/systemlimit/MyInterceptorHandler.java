package com.git.wuqf.systemlimit;

import cn.yueshutong.springbootstartercurrentlimiting.handler.CurrentInterceptorHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptorHandler implements CurrentInterceptorHandler {
    @Override
    public void preHandle(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().print("fail");
    }

}