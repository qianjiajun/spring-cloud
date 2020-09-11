package com.jack.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author qjj
 * @Date 2020-08-19 16:22
 * @Version 1.0
 * @Class ProducerService.java
 */
@FeignClient(name = "${eureka.producer.name}")
public interface ProducerService {

    /**
     * 读取producer-server 子项目的 producer/producer 接口
     * @param name
     * @return string
     */
    @RequestMapping(value = "/producer/producer")
    String producer(@RequestParam(value = "name", required = false) String name);

}
