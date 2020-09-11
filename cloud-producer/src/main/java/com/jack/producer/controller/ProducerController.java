package com.jack.producer.controller;

import com.jack.core.entity.ProducerDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qjj
 * @Date 2020-08-19 15:33
 * @Version 1.0
 * @Class ProducerController.java
 */
@RestController
public class ProducerController {

    @RequestMapping(value = "producer")
    public String producer(@RequestParam(value = "name", required = false) String name) {
        ProducerDTO producer = new ProducerDTO(name);
        return producer.toString();
    }

}
