package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: csliuping@163.com
 * @date: 2020/11/19 17:14
 * @description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_OK，o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_TimeOut，o(╥﹏╥)o";
    }

}
