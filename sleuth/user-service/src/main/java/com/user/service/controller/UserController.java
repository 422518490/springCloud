package com.user.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/31
 * @description
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping("/hi")
    public String hi(){
        return "I'm forezp";
    }
}
