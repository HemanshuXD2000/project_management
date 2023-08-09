package com.example.service;

import com.example.entity.SubTask;

public interface SubtaskService {
	
	public void getAllSubtasks();
	
	SubTask createSubTask(SubTask subTask);
}
