package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LUIKITFUNG
 * @create 2022 - 03 - 04 - 16:58
 **/
//在templates 目录下的页面, 只能通过controller访问
@RestController
public class HelloController {
    public String hello(){
        return "index";
    }
}
