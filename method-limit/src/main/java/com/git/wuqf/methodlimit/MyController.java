package com.git.wuqf.methodlimit;

import cn.yueshutong.springbootstartercurrentlimiting.annotation.CurrentLimiter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/hello")
    @CurrentLimiter(QPS = 2)
    public String hello() {
        return "hello";
    }
}
