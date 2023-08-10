package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.SubTask;

public interface SubTaskService {
	
	public List<SubTask> getAllSubtasks(Long employeeId);

	public void updateProgress(Long subtaskId, Long progressPercentage, String comment);

}
