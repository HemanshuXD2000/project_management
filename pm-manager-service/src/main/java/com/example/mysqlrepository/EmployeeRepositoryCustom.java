package com.example.mysqlrepository;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeRepositoryCustom {

	List<Employee> getAllManagerByAvailability();
	    
	List<Employee> getAllMembersByAvailability();
}
