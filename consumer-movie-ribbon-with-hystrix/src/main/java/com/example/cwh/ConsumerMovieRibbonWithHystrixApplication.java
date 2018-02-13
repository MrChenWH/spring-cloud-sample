package com.example.cwh;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 使用@EnableCircuitBreaker注解开启断路器功能
 *
 *
 *
 * @author cwh
 */
//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker          @SpringCloudApplication注解包含上面三个注解
@SpringCloudApplication
public class ConsumerMovieRibbonWithHystrixApplication {
    /**
     * 实例化RestTemplate，通过@LoadBalanced注解开启均衡负载能力.
     *
     * @return restTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieRibbonWithHystrixApplication.class, args);
    }
}
