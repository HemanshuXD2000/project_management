package com.example.mysqlrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>, EmployeeRepositoryCustom
{

	Employee findByUsername(String email1);
}
