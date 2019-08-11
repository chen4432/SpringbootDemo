package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.applet.Main;

@Controller
public class HellowController {
    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld(){




    return  "hellworld";

    }



}
