package com.kyle.springcloud.service.ribbon.rules;

import com.kyle.springcloud.service.consumer.ribbon.MyRandomRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 小邓
 * @date 2020/10/16 - 10:37
 */
@Configuration
public class MyRibbonRule {

    @Bean
    public IRule myRule(){
        return new MyRandomRule();
    }

}
