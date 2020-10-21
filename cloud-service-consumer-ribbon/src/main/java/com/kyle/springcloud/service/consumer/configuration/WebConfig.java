package com.kyle.springcloud.service.consumer.configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 小邓
 * @date 2020/10/16 - 10:10
 */
@Configuration
public class WebConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 切换ribbon使用的负载均衡算法
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
