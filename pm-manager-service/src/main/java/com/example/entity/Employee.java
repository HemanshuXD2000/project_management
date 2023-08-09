package com.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Employee  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3547964656593165965L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long employeeId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	/*
	@Lob
	@Column(name = "skills", columnDefinition = "CLOB")
	private String skills;
	
	@NotNull
	@Column(name = "designation")
	private String designation;
	*/
	
	@Column(name = "user_type")
	private String userType;
	
	@Column(name = "username", unique = true)
	private String username;
	
	@Column(name = "password")
	private String password;

	@Column(name = "availability", columnDefinition="boolean default 1")
	private boolean availability;
	
	@Column(name="eul_agreement", columnDefinition="boolean default 0")
	private boolean eulAgreement;
	
}