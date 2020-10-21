package com.kyle.springcloud.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 小邓
 * @date 2020/10/16 - 9:27
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceProvider {
    public static void main (String[] args){
        SpringApplication.run(ServiceProvider.class,args);
    }
}
