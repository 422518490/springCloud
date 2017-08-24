package com.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/24
 * @description
 */
@SpringBootApplication
@EnableZipkinServer
public class App {

    public static void main(String [] args){
        SpringApplication.run(App.class,args);
    }

}
