package com.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/21
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {


    public static void main(String [] args){
        SpringApplication.run(EurekaServerApplication.class,args);
    }

}
