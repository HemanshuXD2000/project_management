package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.mysqlrepository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllManagerByAvailability() {
		// TODO Auto-generated method stub
		return employeeRepository.getAllManagerByAvailability();
	}
	
	@Override
	public List<Employee> getAllMembersByAvailability() {
		// TODO Auto-generated method stub
		return employeeRepository.getAllMembersByAvailability();
	}
	
	@Transactional
	@Override
	public Employee getEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		Optional<Employee> optionalEntity =  employeeRepository.findById(employeeId);
		Employee E = optionalEntity.get();
		return E;
	}

	@Override
	public Employee updateEmployeeEul(Employee employee) {
		// TODO Auto-generated method stub
		
		
		employee.setEulAgreement(true);
		Employee EM = employeeRepository.save(employee);
		
		return EM;
	}

}
