package com.chinasoft.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker
@SpringBootApplication
@EnableEurekaClient  //本服务启动后会自动注册进eureka服务中
public class HystrixProviderApplication {
	public static void main(String[] args) {

		SpringApplication.run(HystrixProviderApplication.class, args);
	}
}
