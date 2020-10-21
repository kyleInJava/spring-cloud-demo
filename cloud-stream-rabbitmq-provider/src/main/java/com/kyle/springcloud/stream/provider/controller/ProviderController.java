package com.kyle.springcloud.stream.provider.controller;

import com.kyle.springcloud.stream.provider.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小邓
 * @date 2020/10/17 - 15:40
 */
@RestController
@RequestMapping("message")
public class ProviderController {

    @Autowired
    private MessageService messageService;
    @GetMapping("send")
    public void sendMessage(){
        messageService.sendMessage();
    }
}
