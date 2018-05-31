package cn.lifuz.self.eureka.consume.rribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName EurekaConsumerRibbonApplication
 * @Description
 * @Author lifuz
 * @Email lifuzz@163.com
 * @Date 2018/5/31 16:00
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
    }
}
