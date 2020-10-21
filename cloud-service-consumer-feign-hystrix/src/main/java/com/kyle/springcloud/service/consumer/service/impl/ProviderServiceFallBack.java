package com.kyle.springcloud.service.consumer.service.impl;

import com.kyle.springcloud.service.consumer.service.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @author 小邓
 * @date 2020/10/16 - 15:26
 */
@Component
public class ProviderServiceFallBack implements ProviderService {

    @Override
    public String getInfo() {
        return "获取信息失败";
    }

    @Override
    public String getInfoTimeout() {
        return "获取信息超时";
    }
}
