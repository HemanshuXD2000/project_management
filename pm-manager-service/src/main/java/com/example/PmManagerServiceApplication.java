package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories(basePackages = {"com.example.mongorepository"})
@EnableJpaRepositories (basePackages = {"com.example.mysqlrepository","com.example.repository"})
public class PmManagerServiceApplication {

	
		
	public static void main(String[] args) {
		SpringApplication.run(PmManagerServiceApplication.class, args);
	}
}
