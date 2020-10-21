package com.kyle.springcloud.stream.consumer.service.impl;

import com.kyle.springcloud.stream.consumer.message.MySink;
import com.kyle.springcloud.stream.consumer.service.MessageService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * @author 小邓
 * @date 2020/10/17 - 16:02
 */
@Service
@EnableBinding(MySink.class)
public class MessageServiceImpl implements MessageService {

    @StreamListener(MySink.MY_INPUT)
    @Override
    public void receiveMessage(Message<String> message) {
        System.out.println(message.getPayload());
    }
}
