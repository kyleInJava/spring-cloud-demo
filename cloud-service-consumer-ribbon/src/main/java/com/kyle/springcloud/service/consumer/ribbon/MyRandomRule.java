package com.kyle.springcloud.service.consumer.ribbon;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.Random;

/**
 * @author 小邓
 * @date 2020/10/16 - 10:40
 */
public class MyRandomRule extends AbstractLoadBalancerRule {

    private Random random;

    public MyRandomRule(){
        random = new Random();
    }

    //从服务清单中随机选择一个服务实例
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            //负载均衡来获得可用实例列表upList和allList
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == 0) {
                return null;
            }

            //随机来获取一个随机数
            int index = random.nextInt(serverCount);
            //随机数作为upList的索引值来返回具体实例
            server = upList.get(index);

            if (server == null) {
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            // Shouldn't actually happen.. but must be transient or a bug.
            server = null;
            Thread.yield();
        }
        //正常情况下，每次都应该可以选择一个服务实例
        return server;

    }

    //接口中的choose委托给该类中的choose(getLoadBalancer(), key)方法
    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {

    }
}
