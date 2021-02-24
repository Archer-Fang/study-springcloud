package com.eiletxie.springcloud.service;

import com.eiletxie.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author fzj
 * @Since 2021/2/22 12:00
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
