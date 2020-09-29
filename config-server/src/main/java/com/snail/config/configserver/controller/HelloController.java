package com.snail.config.configserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/29 21:59
 */
@RestController
public class HelloController {

    @Value("${message:World1}")
    String name="World";

    @GetMapping("/hello")
    public String hello(){
        return "Hello "+name;
    }
}
