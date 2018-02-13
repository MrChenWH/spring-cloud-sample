package com.example.cwh.user.controller;

import com.example.cwh.user.feign.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cwh
 */
@RestController
public class DcController {
    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String hello() {
        return dcClient.consumer();
    }
}
