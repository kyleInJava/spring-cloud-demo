package com.kyle.springcloud.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 小邓
 * @date 2020/10/16 - 10:26
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceProvider {
    
    public static void main (String[] args){
        SpringApplication.run(ServiceProvider.class,args);
    }
}
