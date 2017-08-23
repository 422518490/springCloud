package com.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/22
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class App {

    public static void main(String [] args){
        SpringApplication.run(App.class,args);
    }

}
