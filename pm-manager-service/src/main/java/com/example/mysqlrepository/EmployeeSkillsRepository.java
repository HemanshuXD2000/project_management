package com.example.mysqlrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.composite.ProjectEmployeeSkillsComposite;
import com.example.entity.EmployeeSkills;


public interface EmployeeSkillsRepository extends JpaRepository<EmployeeSkills, ProjectEmployeeSkillsComposite>, EmployeeSkillsRepositoryCustom
{
		

}
