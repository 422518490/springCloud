package com.turbine.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/24
 * @description
 */
@RestController
public class CallHomeController {

    private static final Logger logger = LoggerFactory.getLogger(CallHomeController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@RequestParam String name) {
        return "hi "+name+",i  am lucy and from port:" +port;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
