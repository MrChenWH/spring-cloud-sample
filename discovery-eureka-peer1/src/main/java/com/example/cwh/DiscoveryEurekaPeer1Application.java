package com.example.cwh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 使用eureka做服务发现
 *
 * @author cwh
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryEurekaPeer1Application {
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryEurekaPeer1Application.class, args);
	}
}
