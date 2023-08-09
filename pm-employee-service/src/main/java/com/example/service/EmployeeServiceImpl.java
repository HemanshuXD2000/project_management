package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.EmployeeEntity;
import com.example.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity);
	}

}
