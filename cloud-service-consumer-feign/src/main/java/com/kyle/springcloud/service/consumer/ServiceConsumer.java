package com.kyle.springcloud.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 小邓
 * @date 2020/10/16 - 11:04
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceConsumer {

    public static void main (String[] args){
        SpringApplication.run(ServiceConsumer.class,args);
    }
}
