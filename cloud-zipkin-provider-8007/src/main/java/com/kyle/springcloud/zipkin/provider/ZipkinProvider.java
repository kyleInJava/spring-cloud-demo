package com.kyle.springcloud.zipkin.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 小邓
 * @date 2020/10/18 - 11:42
 */
@SpringBootApplication
@EnableEurekaClient
public class ZipkinProvider {
    public static void main (String[] args){
        SpringApplication.run(ZipkinProvider.class,args);
    }
}
