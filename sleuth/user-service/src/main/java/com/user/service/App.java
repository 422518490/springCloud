package com.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/31
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class App {

    public static void main(String [] args){
        SpringApplication.run(App.class,args);
    }

}
