package cn.lifuz.self.eureka.consume.rribbon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RibbonController
 * @Description
 * @Author lifuz
 * @Email lifuzz@163.com
 * @Date 2018/5/31 16:11
 * @Version 1.0
 */
@RestController
public class RibbonController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/customer")
    public String customer() {

        return restTemplate.getForObject("http://eureka-client/dc", String.class);

    }
}
