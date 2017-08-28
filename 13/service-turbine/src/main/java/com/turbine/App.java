package com.turbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/28
 * @description
 */
@SpringBootApplication
@EnableTurbine
public class App {

    public static void main(String[] args) {

        new SpringApplicationBuilder(App.class).web(true).run(args);
    }

}
