package com.example.mysqlrepository;

import java.util.List;

import com.example.entity.Employee;
import com.example.entity.EmployeeSkills;

public interface EmployeeSkillsRepositoryCustom {
	
	List<Employee> getEmployeesBySkill(String skillName);
	List<EmployeeSkills> getEmployeeSkills(Long employeeId);

}
