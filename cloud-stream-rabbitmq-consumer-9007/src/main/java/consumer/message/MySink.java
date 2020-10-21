package consumer.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @author 小邓
 * @date 2020/10/17 - 16:00
 */
@Component
public interface MySink {

    String MY_INPUT = "my_input";

    @Input(MY_INPUT)
    SubscribableChannel input();
}
