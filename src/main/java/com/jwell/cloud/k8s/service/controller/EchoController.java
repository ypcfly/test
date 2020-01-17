package com.jwell.cloud.k8s.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @Date 2020/1/9 10:40
 * @Description
 */
@Slf4j
@RestController
@RequestMapping("/k8s")
public class EchoController {

    @GetMapping("/hello")
    public ResponseEntity test() {
        log.info(">>>> test-service controller start <<<<");
        return ResponseEntity.ok("hello from k8s-service");
    }

}
