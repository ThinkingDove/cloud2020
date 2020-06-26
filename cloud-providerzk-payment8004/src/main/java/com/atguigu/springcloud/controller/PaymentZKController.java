package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author lirenxiang
 * @date 2020/6/21 26:29
 */
@RestController
@Slf4j
public class PaymentZKController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper: " + serverPort +"\t"+ UUID.randomUUID().toString();
    }

}
