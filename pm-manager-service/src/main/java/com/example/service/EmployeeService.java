package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllManagerByAvailability();
	List<Employee> getAllMembersByAvailability();
	Employee getEmployeeById(Long employeeId);
	Employee updateEmployeeEul(Employee employee);
}
