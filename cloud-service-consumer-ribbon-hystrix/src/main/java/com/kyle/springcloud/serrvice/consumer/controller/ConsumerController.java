package com.kyle.springcloud.serrvice.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 小邓
 * @date 2020/10/16 - 14:47
 */
@RestController
@RequestMapping("consumer")
@DefaultProperties(defaultFallback = "getInfoTimeoutDefaultFallbackMethod")
public class ConsumerController {

    private static final String PROVIDER_URL = "http://service-provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("info")
    public String getInfo(){
        return restTemplate.getForObject(PROVIDER_URL+"/provider/info",String.class);
    }

    @GetMapping("info/timeout")
    @HystrixCommand(fallbackMethod = "getInfoTimeoutFallbackMethod",
            commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1500")
    })
    public String getInfoTimeout(){
        return restTemplate.getForObject(PROVIDER_URL+"/provider/info/timeout",String.class);
    }

    @GetMapping("info/timeout/default")
    @HystrixCommand
    public String getInfoTimeoutDefault(){
        return restTemplate.getForObject(PROVIDER_URL+"/provider/info/timeout",String.class);
    }

    @GetMapping("info/fusing/{id}")
    @HystrixCommand(fallbackMethod = "getInfoFusingFallbackMethod",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),// 失败率达到多少后跳闸
    })
    public String getInfoFusing(@PathVariable("id") Integer id){
        if(id < 0){
            throw new RuntimeException("******id 不能负数");
        }
        return restTemplate.getForObject(PROVIDER_URL+"/provider/info",String.class);
    }


    public String getInfoTimeoutFallbackMethod(){
        return "网络繁忙，请稍候再试";
    }

    public String getInfoTimeoutDefaultFallbackMethod(){
        return "全局降级，网络繁忙，请稍候再试";
    }

    public String getInfoFusingFallbackMethod(Integer id){
        return "熔断，网络繁忙，请稍候再试"+id;
    }
}
