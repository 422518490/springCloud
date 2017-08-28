package eureka.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/21
 * @description
 */
@RestController
public class EurekaClientController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
