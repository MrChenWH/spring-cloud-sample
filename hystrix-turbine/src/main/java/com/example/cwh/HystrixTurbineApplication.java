package com.example.cwh;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * 通过@EnableTurbine接口，激活对Turbine的支持。
 * @author cwh
 */
@SpringBootApplication
@EnableTurbineStream
public class HystrixTurbineApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(HystrixTurbineApplication.class).web(true).run(args);
	}
}

