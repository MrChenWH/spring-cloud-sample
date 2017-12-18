package com.example.cwh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册中信Consul
 *
 * @author cwh
 */
@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class DiscoveryConsulApplication
{

    @RequestMapping("/")
    public String home()
    {
        return "Hello world";
    }

    public static void main(String[] args)
    {
        SpringApplication.run(DiscoveryConsulApplication.class, args);
    }
}
