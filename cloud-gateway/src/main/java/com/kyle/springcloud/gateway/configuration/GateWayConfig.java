package com.kyle.springcloud.gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 小邓
 * @date 2020/10/17 - 11:13
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //使用代码定义路由规则，/ 路径默认访问百度官网
        routes.route("route3",
                r -> r.path("/")
                        .uri("http://www.baidu.com")).build();

        return routes.build();
    }
}
