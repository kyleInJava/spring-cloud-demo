package com.kyle.springcloud.stream.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 小邓
 * @date 2020/10/17 - 15:58
 */
@SpringBootApplication
@EnableEurekaClient
public class Consumer {
    public static void main (String[] args){
        SpringApplication.run(Consumer.class,args);
    }
}
