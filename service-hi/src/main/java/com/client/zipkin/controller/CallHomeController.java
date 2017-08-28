package com.client.zipkin.controller;

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

    @RequestMapping("/hi")
    public String callHome(){
        logger.info("calling trace service-hi ");
        return restTemplate.getForObject("http://localhost:8989/hi", String.class);
    }

    @RequestMapping("/info")
    public String info(){
        logger.info("calling trace service-hi ");

        return "i'm service-hi";

    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }


}
