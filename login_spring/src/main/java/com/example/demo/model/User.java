package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee")

public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employe_id")
	private int employeeId;
	
	@Column(name="firstName")
	private String firstName;
	
    @Column(name="middle_name")	
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="user_name", unique=true)
	private String userName;
	
	@Column(name="user_type")
	private String userType;
	
	@Column(name="password")
	private String password;
	
	@Column(name="availability")
	private boolean availability;
	
	@Column(name="eul_agreement")
	private boolean eulAgreement;
	
	

}
