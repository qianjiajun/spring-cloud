package com.jack.consumer.controller;

import com.jack.consumer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author qjj
 * @Date 2020-08-19 15:33
 * @Version 1.0
 * @Class ProducerController.java
 */
@RestController
public class ConsumerController {

    @Autowired
    private ProducerService producerService;

    /**
     * 参数需要完全一致
     * @param name
     * @return
     */
    @RequestMapping(value = "consumer")
    public String consumer(@RequestParam(value = "name", required = false) String name) {
        String consumer = producerService.producer(name);
        return String.format("%s: Consumer-Client(port:7002): %s", name, consumer);
    }

}
