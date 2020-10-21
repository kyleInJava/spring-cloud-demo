package com.kyle.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 小邓
 * @date 2020/10/16 - 22:01
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Zuul {

    public static void main (String[] args){
        SpringApplication.run(Zuul.class,args);
    }
}
