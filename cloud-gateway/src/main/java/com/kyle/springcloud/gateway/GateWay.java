package com.kyle.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 小邓
 * @date 2020/10/17 - 10:47
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWay {
    public static void main (String[] args){
        SpringApplication.run(GateWay.class,args);
    }
}
