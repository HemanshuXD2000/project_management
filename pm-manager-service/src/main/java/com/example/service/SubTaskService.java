package com.example.service;

import java.util.List;

import com.example.entity.Subtask;
import com.example.entity.Task;

public interface SubTaskService {
	List<Subtask> findByTaskId(Task task);
	Subtask saveSubTask(Subtask subTask);
}
