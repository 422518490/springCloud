package com.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/28
 * @description
 */
@SpringBootApplication
@EnableTurbine
public class App {

    public static void main(String [] args){
        SpringApplication.run(App.class,args);
    }

}
