package com.git.wuqf.iplimit;

import cn.yueshutong.springbootstartercurrentlimiting.handler.CurrentRuleHandler;
import cn.yueshutong.springbootstartercurrentlimiting.property.CurrentProperty;
import cn.yueshutong.springbootstartercurrentlimiting.property.CurrentPropertyFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyRule implements CurrentRuleHandler {
    @Override
    public CurrentProperty rule(HttpServletRequest request) {
        return CurrentPropertyFactory.of("127.0.0.1",100,0,true,true);
    }
}
