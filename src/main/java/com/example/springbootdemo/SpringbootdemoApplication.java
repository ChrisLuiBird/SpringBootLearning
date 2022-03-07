package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//标注这个类是一个springboot应用
@SpringBootApplication
public class SpringbootdemoApplication {
//启动springboot应用程序
    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}
