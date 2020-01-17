package com.jwell.cloud.k8s.service.repository;

import com.jwell.cloud.k8s.service.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {

    OrderEntity findByUserId(Long userId);

    OrderEntity queryByOrderId(Long orderId);
}
