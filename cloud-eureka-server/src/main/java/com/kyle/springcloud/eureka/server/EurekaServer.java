package com.kyle.springcloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 小邓
 * @date 2020/10/16 - 9:10
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main (String[] args){
        SpringApplication.run(EurekaServer.class,args);
    }

}
