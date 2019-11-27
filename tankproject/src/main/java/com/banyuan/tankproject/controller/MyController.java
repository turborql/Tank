package com.banyuan.tankproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description
 * @author：ql
 * @date:Created in 2019/11/27 4:38 下午
 */
@Controller
public class MyController {
    @RequestMapping("/login")
    public String html(){
        return  "login";
    }
}
