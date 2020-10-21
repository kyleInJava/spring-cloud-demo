package com.kyle.springcloud.stream.provider.service.impl;

import com.kyle.springcloud.stream.provider.message.MySource;
import com.kyle.springcloud.stream.provider.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 小邓
 * @date 2020/10/17 - 15:44
 */
@Service
@EnableBinding(value = {MySource.class})
public class SendMessageServiceImpl implements MessageService {

    private AtomicInteger count = new AtomicInteger();

    @Autowired
    @Qualifier(MySource.MY_OUTPUT)
    MessageChannel channel;

    @Override
    public void sendMessage() {
        String msg = "message"+ count.decrementAndGet();
        Message<String> message = MessageBuilder.withPayload(msg).build();
        channel.send(message);
    }
}
