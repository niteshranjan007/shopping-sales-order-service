package com.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.shopping")
public class ShoppingSalesOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingSalesOrderServiceApplication.class, args);
	}

}
