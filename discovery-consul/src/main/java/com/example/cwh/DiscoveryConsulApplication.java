package com.example.cwh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 注册中心Consul
 *
 * @author cwh
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class DiscoveryConsulApplication
{
    @Autowired
    private DiscoveryClient discoveryClient;

    public String serviceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances("STORES");
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri().toString();
        }
        return null;
    }

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
