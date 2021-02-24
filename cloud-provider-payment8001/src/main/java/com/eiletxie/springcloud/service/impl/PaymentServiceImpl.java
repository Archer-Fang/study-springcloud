package com.eiletxie.springcloud.service.impl;

import com.eiletxie.springcloud.dao.PaymentDao;
import com.eiletxie.springcloud.entities.Payment;
import com.eiletxie.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author fzj
 * @Since 2021/2/22 12:02
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
