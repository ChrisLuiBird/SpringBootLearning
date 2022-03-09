package com.example.springbootdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author LUIKITFUNG
 * @create 2022 - 03 - 09 - 14:46
 **/
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    @Value("doggy")
    private String name;
    @Value("1")
    private Integer age;
}
