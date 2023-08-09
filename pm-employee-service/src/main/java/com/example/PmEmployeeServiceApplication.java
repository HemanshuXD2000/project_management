package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@SpringBootApplication
@EnableEurekaClient
public class PmEmployeeServiceApplication implements CommandLineRunner{

	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(PmEmployeeServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee entity = new Employee();
		entity.setFirstName("John");
		entity.setLastName("Doe");
		entity.setSkills("FrontEnd");
		entity.setDesignation("Associate");
		entity.setUserType("employee");
		entity.setAvailability(true);
		entity.setEmail("johnd@email.com");
		entity.setPassword("test123");
		employeeService.createEmployee(entity);
		
	}

}
