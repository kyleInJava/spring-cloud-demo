package com.kyle.springcloud.stream.consumer.service;

import org.springframework.messaging.Message;

/**
 * @author 小邓
 * @date 2020/10/17 - 16:01
 */
public interface MessageService {

    void receiveMessage(Message<String> message);
}
