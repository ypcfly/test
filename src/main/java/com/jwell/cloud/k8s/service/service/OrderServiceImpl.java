package com.jwell.cloud.k8s.service.service;

import com.jwell.cloud.k8s.service.entity.OrderEntity;
import com.jwell.cloud.k8s.service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author Administrator
 * @Date 2020/1/16 14:01
 * @Description
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderEntity saveEntity(OrderEntity orderEntity) {
        Date now = new Date();
        orderEntity.setCreateTime(now);
        orderEntity.setUpdateTime(now);
        return orderRepository.save(orderEntity);
    }

    @Override
    public List<OrderEntity> queryAll() {
        return orderRepository.findAll();
    }

    @Override
    public OrderEntity queryByOrderId(Long orderId) {
        return orderRepository.queryByOrderId(orderId);
    }


}
