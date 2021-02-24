package com.eiletxie.springcloud.alibaba.service;

import com.eiletxie.springcloud.alibaba.domain.Order;

/**
 * @Author fzj
 * @Since 2021/2/18 21:17
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}