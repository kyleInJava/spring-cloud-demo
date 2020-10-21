package com.kyle.springcloud.service.consumer;

import com.kyle.springcloud.service.ribbon.rules.MyRibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 小邓
 * @date 2020/10/16 - 9:32
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="service-provider",configuration = MyRibbonRule.class)
public class ServiceConsumer {

    public static void main (String[] args){
        SpringApplication.run(ServiceConsumer.class,args);
    }
}
