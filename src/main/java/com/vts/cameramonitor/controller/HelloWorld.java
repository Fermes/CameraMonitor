package com.vts.cameramonitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Viking on 2017/3/31.
 */

@Controller
public class HelloWorld {
    @RequestMapping("/HelloWorld")
    public String hello(){
        System.out.println("Hello World!");;
        return "/jsp/hello.jsp";
    }
}
