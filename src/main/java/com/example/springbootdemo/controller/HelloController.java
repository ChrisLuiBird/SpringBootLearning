package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LUIKITFUNG
 * @create 2022 - 03 - 04 - 16:58
 **/

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
