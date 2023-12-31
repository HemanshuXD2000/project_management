package com.example.mysqlrepository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Employee;
import com.example.entity.EmployeeSkills;

@Repository
@Transactional
public class EmployeeSkillsRepositoryImpl  implements EmployeeSkillsRepositoryCustom{
	

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeesBySkill(String skillName) {
		// TODO Auto-generated method stub
		 Query query = entityManager.createNativeQuery(
				 "select * from employee e inner join employee_skills es where e.employee_id = es.employee_id \r\n" 
		 + "and e.user_type = 'EMPLOYEE' and e.availability=1 and es.skill_id= (Select skill_id from skills where skill_name=:skillName); ", 
		 		Employee.class);
		 query.setParameter("skillName", skillName);
		 
		 return query.getResultList();
	}
	
	
	@Override
	public List<EmployeeSkills> getEmployeeSkills(Long employeeId) {
		// TODO Auto-generated method stub
		TypedQuery<EmployeeSkills> query = entityManager.createQuery(
	            "SELECT es FROM EmployeeSkills es JOIN es.employeeId e WHERE e.employeeId = :employeeId",
	            EmployeeSkills.class);


			 query.setParameter("employeeId", employeeId);
			 
			 return query.getResultList();
			 
			 
				
	}

}
