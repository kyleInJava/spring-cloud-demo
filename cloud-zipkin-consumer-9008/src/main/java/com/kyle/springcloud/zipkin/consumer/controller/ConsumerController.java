package com.kyle.springcloud.zipkin.consumer.controller;

import com.kyle.springcloud.zipkin.consumer.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小邓
 * @date 2020/10/16 - 11:05
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("info")
    public String getInfo(){
        System.out.println("info");
        return providerService.getInfo();
    }

}
