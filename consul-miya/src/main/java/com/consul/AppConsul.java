package com.consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/28
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class AppConsul {

    @RequestMapping("/hi")
    public String home() {
        return "hi ,i'm miya";
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(AppConsul.class).web(true).run(args);
    }

}
