package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdminViewApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminViewApplication.class, args);
	}

}
