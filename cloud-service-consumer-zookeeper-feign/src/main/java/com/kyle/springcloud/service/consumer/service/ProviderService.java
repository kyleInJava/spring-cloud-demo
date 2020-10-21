package com.kyle.springcloud.service.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 小邓
 * @date 2020/10/16 - 11:06
 */
@FeignClient("service-provider")
public interface ProviderService {

    @GetMapping("/provider/info")
    String getInfo();
}
