package com.kyle.springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小邓
 * @date 2020/10/17 - 13:54
 */
@RefreshScope
@RestController
@RequestMapping("config")
public class ConfigClientController {

    @Value("${name}")
    private String name;

    @GetMapping("name")
    public String getName(){
        return name;
    }
}
