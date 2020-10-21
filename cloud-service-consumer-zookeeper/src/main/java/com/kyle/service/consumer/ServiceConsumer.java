package com.kyle.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 小邓
 * @date 2020/10/16 - 9:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceConsumer {

    public static void main (String[] args){
        SpringApplication.run(ServiceConsumer.class,args);
    }
}
