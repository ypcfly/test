package com.jwell.cloud.k8s.service.controller;

import com.jwell.cloud.k8s.service.entity.OrderEntity;
import com.jwell.cloud.k8s.service.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2020/1/16 13:59
 * @Description
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/save")
    public ResponseEntity<OrderEntity> save(@RequestBody OrderEntity orderEntity) {

        return ResponseEntity.ok(orderService.saveEntity(orderEntity));
    }

    @GetMapping("/query/all")
    public ResponseEntity<List<OrderEntity>> queryAll() {
        List<OrderEntity> orderEntityList = orderService.queryAll();
        return ResponseEntity.ok(orderEntityList);
    }

    @GetMapping("/queryById/{orderId}")
    public ResponseEntity<OrderEntity> queryByOrderId(@PathVariable("orderId") Long orderId) {
        OrderEntity orderEntity = orderService.queryByOrderId(orderId);
        return ResponseEntity.ok(orderEntity);
    }

}
