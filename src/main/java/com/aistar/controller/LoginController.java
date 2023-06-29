package com.aistar.controller;

import com.aistar.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    //@RequestMapping默认响应get请求,@PostMapping响应post,@GetMapping不需要传值
    @RequestMapping("/login")
    //上面有RestController，无需@RequestBody
    //url拼接  <URL>?xxx=xxx
    public String login(@RequestParam(value = "user") String name,String pwd){
        if (name.equals("jsy") && pwd.equals("123456"))
            return "Hello! "+name;
        else
            return "login failed";
    }
    //处理json，用类接受json,返回一个json
    @PostMapping("/loginPost")
    public User loginPost(@RequestBody User user){
        return new User("A","123456");

    }
}
