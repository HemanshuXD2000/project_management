package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import com.example.demo.entity.*;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.SubTaskRepository;
import com.example.demo.repository.TaskRepository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class SubTaskDaoImpl implements SubTaskDao{
	
	private final EntityManager entityManager;
	private final TaskRepository taskRepository;
	private final SubTaskRepository subTaskRepository;

	@Override
	public void updateProgress(Long subTaskId, Long progressPercentage, String comment) {
		
		Session currentSession=entityManager.unwrap(Session.class);
		Query<SubTask> query=currentSession.createQuery("update SubTask set progressPercentage=:updated, comment=:newComment where subTaskId=:Id").
				setParameter("updated", progressPercentage).setParameter("Id", subTaskId).setParameter("newComment", comment);
		query.executeUpdate();
		updateTaskProgress(subTaskId, progressPercentage);
	}
	
	public void updateTaskProgress(Long subTaskId,Long progressPercentage) {
		
		Long totalProgress=0L;
		
		SubTask subTask=subTaskRepository.findBySubTaskId(subTaskId);
		
		Task taskObj=subTask.getTaskId();
		
		Long taskId=taskObj.getTaskId();
		
		List<SubTask> subTasks=subTaskRepository.findByTaskId(taskObj);
		
		for(SubTask eachTask:subTasks) {
			totalProgress+=eachTask.getProgressPercentage();
		}
		
		Task tasks = entityManager.find(Task.class, taskId);
		Long subtaskCount =  tasks.getSubTaskCount();
		
		Long updatedVal = totalProgress/subtaskCount;
		
		tasks.setProgress(updatedVal);
		
		
	}
	
	
	
	

}
