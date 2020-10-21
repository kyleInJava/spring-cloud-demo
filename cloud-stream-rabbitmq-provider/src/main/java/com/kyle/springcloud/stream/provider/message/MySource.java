package com.kyle.springcloud.stream.provider.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * @author 小邓
 * @date 2020/10/17 - 15:45
 */
@Component
public interface MySource {

    String MY_OUTPUT = "my_output";

    @Output(MY_OUTPUT)
    MessageChannel output();

}
