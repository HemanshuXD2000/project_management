package com.example.service;

import java.util.List;

import com.example.entity.Task;

public interface TaskService {

	public List<Task> getAllTasksByProjectId(Long projectId);
	public Task saveTask(Task task);
}
