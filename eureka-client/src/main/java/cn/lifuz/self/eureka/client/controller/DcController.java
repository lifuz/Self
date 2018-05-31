package cn.lifuz.self.eureka.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DcController
 * @Description
 * @Author lifuz
 * @Email lifuzz@163.com
 * @Date 2018/5/31 11:01
 * @Version 1.0
 */
@RestController
public class DcController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services  = "Services:" + discoveryClient.getServices();
        logger.error(services);
        return services;
    }

}


