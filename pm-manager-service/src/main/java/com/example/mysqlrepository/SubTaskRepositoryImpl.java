package com.example.mysqlrepository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Subtask;
import com.example.entity.Task;



@Repository
@Transactional
public class SubTaskRepositoryImpl  implements SubTaskRepositoryCustom{
	

	@PersistenceContext
	EntityManager entityManager;

	

	@SuppressWarnings("unchecked")
	@Override
	public List<Subtask> getAllSubTasksByTaskId(Task task) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNativeQuery("select * from subtask where task_id=:taskId",Subtask.class);
		query.setParameter("taskId", task);
		return query.getResultList();
	}

	

}
