package com.shopping.OrderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.shopping.repository.AddressRepository;
import com.shopping.repository.OrderRepository;

@SpringBootApplication
@ComponentScan("com.shopping")

@EnableMongoRepositories(basePackageClasses = {OrderRepository.class, AddressRepository.class })
@EnableEurekaClient
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
