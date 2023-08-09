package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	
	private String firstName;
	
	private String lastName;
	
	private String skills;
	
	private String designation;
	
	private String userType;
	
	private String email;
	
	private String password;
	
	private boolean availability;
	
}
