package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lirenxiang
 * @date 2020/5/3 20:42
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){

        int result = paymentService.create(payment);
        log.info("*****插入结果"+result);

        if (result > 0){
            return new CommonResult(200,"插入结果成功,serverPort:"+serverPort,result);
        }else{
            return new CommonResult(444,"插入结果失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果"+payment);

        if (payment != null){
            return new CommonResult(200,"查询结果成功,serverPort:"+serverPort,payment);
        }else{
            return new CommonResult(444,"查询结果失败");
        }
    }

}
