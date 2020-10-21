package com.kyle.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 小邓
 * @date 2020/10/17 - 11:54
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServer {

    public static void main (String[] args){
        SpringApplication.run(ConfigServer.class,args);
    }

}
