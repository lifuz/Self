package cn.lifuz.self.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName EurekaClientApplication
 * @Description
 * @Author lifuz
 * @Email lifuzz@163.com
 * @Date 2018/5/31 11:00
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
