package com.example.service;

import java.util.List;

import com.example.entity.Employee;
import com.example.entity.EmployeeSkills;

public interface EmployeeSkillsService {

	List<Employee> getEmployeesBySkill(String skillName);
	List<EmployeeSkills> getEmployeeSkills(Long employeeId);
}
