package com.jwell.cloud.k8s.service.service;

import com.jwell.cloud.k8s.service.entity.OrderEntity;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2020/1/16 14:00
 * @Description
 */
public interface OrderService {

    OrderEntity saveEntity(OrderEntity orderEntity);

    List<OrderEntity> queryAll();

    OrderEntity queryByOrderId(Long orderId);
}
