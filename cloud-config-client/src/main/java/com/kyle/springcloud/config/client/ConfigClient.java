package com.kyle.springcloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 小邓
 * @date 2020/10/17 - 13:52
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient {

    public static void main (String[] args){
        SpringApplication.run(ConfigClient.class,args);
    }
}
