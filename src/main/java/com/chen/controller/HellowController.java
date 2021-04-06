package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.applet.Main;

@Controller
public class HellowController {
    //2021年4月6日 22:44:35
    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld() {
        //2021年4月6日 22:57:03
        //二〇二一年四月六日 22:58:30
        //2021年4月6日 22:56:25
        String name = "chen";
        String name2 = "chen";
        System.out.println("hello");
        System.out.println("cccc");
        int age=22;
        System.out.println(age);

        return "hellworld";

    }


}
