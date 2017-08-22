package com.client.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/21
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {

    public static void main(String [] args){
        SpringApplication.run(EurekaClientApplication.class,args);
    }

}
