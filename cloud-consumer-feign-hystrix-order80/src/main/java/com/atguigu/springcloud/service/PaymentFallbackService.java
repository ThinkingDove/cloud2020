package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author lirenxiang
 * @date 2020/12/1 21:06
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {


    @Override
    public String paymentInfo_OK(Integer id) {
        return "----paymentFallbackService fall back,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----paymentFallbackService fall back,o(╥﹏╥)o";
    }
}
