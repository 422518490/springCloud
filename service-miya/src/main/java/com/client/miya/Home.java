package com.client.miya;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/24
 * @description
 */
@RestController
public class Home {

    private static  final Logger logger = LoggerFactory.getLogger(Home.class);

    @RequestMapping("/hi")
    public String home(){
        logger.info("hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        logger.info("info is being called");
        return restTemplate.getForObject("http://localhost:8988/info",String.class);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
