package cn.lifuz.self.eureka.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName DcController
 * @Description
 * @Author lifuz
 * @Email lifuzz@163.com
 * @Date 2018/5/31 12:17
 * @Version 1.0
 */
@RestController
public class DcController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/customer")
    public String customer() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";

        logger.error(url);
        return restTemplate.getForObject(url, String.class);

    }



}
