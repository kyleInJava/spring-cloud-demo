package com.kyle.springcloud.service.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小邓
 * @date 2020/10/16 - 9:40
 */
@RestController
@RequestMapping("provider")
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("info")
    public String getInfo(){
        return "serivce provider "+port;
    }

    @GetMapping("info/timeout")
    public String getInfoTimeout(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "serivce provider "+port;
    }

}
