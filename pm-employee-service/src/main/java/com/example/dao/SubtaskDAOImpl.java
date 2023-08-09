package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.ProjectMember;
import com.example.entity.SubTask;
import com.example.repository.ProjectMemeberRepository;
import com.example.repository.TaskRepository;

@Repository
public class SubtaskDAOImpl implements SubtaskDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	private ProjectMemeberRepository projectMemeberRepository;
	
	@Autowired
	private TaskRepository taskRepository;
	
	public SubtaskDAOImpl(EntityManager entityManager)
	{
		super();
		this.entityManager = entityManager;
	}
	
	public List<ProjectMember> getprojectmember(Long theId)
	{
		return projectMemeberRepository.findByEmployeeId(theId);
	}

	@Override
	public void getAllSubtasks() {
		Session currentSession = entityManager.unwrap(Session.class);
		Long theid = 1L;
		Query query = currentSession.createQuery("from Subtask");
		List<SubTask> subTasks = query.getResultList();
		System.out.println(subTasks);
	}

}
