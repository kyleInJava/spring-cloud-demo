package com.kyle.springcloud.zipkin.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 小邓
 * @date 2020/10/18 - 11:51
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ZipkinConsumer {

    public static void main (String[] args){
        SpringApplication.run(ZipkinConsumer.class,args);
    }
}
