package com.eurkea.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/31
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class App {

    public static void main(String [] args){
        SpringApplication.run(App.class,args);
    }

}
