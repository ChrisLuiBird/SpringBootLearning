package com.example.springbootdemo;

import com.example.springbootdemo.pojo.Person;
import com.example.springbootdemo.pojo.Pet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootdemoApplicationTests {

    @Autowired
    private Pet pet;

    @Autowired
    private Person p;
    @Test
    void contextLoads() {
//        正常pojo赋值
        System.out.println(pet);
    // yml 赋值
        System.out.println(p);
    }

}
