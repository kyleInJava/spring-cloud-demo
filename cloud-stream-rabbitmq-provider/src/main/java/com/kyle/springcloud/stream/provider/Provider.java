package com.kyle.springcloud.stream.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 小邓
 * @date 2020/10/17 - 15:39
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider {
    public static void main (String[] args){
        SpringApplication.run(Provider.class,args);
    }
}
