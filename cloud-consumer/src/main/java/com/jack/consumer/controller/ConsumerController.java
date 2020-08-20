package com.jack.consumer.controller;

import com.jack.consumer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "consumer", method = RequestMethod.GET)
    public String consumer() {
        String consumer = producerService.producer();
        return String.format("Consumer-Client(port:7002): %s", consumer);
    }

}
