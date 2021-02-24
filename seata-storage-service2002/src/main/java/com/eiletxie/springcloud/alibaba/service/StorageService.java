package com.eiletxie.springcloud.alibaba.service;


/**
 * @Author fzj
 * @Since 2021/2/18 22:58
 */
public interface StorageService {

    void decrease(Long productId, Integer count);

}
