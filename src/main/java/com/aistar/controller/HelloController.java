package com.aistar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    //返回HTML响应体
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world,modified by jsy";
    }
    @RequestMapping("/hello1")
    public String hello1(){
        return "/img/2.jpg";
    }
    @RequestMapping("/getPage")
    public String getPage(){
        return "/img/testHTML.html";
    }
}