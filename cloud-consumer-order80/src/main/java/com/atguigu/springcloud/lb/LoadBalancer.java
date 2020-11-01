package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author lirenxiang
 * @date 2020/11/1 11:53
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstance);

}
