package com.kyle.springcloud.service.consumer.service;

import com.kyle.springcloud.service.consumer.service.impl.ProviderServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 小邓
 * @date 2020/10/16 - 11:06
 */
@FeignClient(value = "service-provider",fallback = ProviderServiceFallBack.class)
@Primary
public interface ProviderService {

    @GetMapping("/provider/info")
    String getInfo();

    @GetMapping("/provider/info/timeout")
    String getInfoTimeout();
}
