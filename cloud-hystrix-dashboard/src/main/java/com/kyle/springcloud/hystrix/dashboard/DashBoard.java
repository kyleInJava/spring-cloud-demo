package com.kyle.springcloud.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 小邓
 * @date 2020/10/16 - 21:15
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashBoard {

    public static void main (String[] args){
        SpringApplication.run(DashBoard.class,args);
    }
}
