package com.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/23
 * @description
 */
@SpringBootApplication
@EnableConfigServer
public class App {

    public static void main(String []args){
        SpringApplication.run(App.class,args);
    }

}
