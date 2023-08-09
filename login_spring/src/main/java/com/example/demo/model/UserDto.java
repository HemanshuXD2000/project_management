package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	
	private long employeeId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String userType;
    private String username;
    private String password;
    private Boolean availability;
    private Boolean eulAgreement;


}
