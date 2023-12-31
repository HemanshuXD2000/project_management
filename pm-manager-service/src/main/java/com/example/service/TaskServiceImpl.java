package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Task;
import com.example.mysqlrepository.TaskRepository;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public List<Task> getAllTasksByProjectId(Long projectId) {
		// TODO Auto-generated method stub
		return taskRepository.getAllTasksByProjectId(projectId);
	}

	@Override
	public Task saveTask(Task task) {
		// TODO Auto-generated method stub
		return taskRepository.save(task);
	}

	
	public Task getTasksById(Long taskId) {
		// TODO Auto-generated method stub
		Optional<Task>  optionalEntity = taskRepository.findById(taskId);
		Task T = optionalEntity.get();
		return T;
	}
}
