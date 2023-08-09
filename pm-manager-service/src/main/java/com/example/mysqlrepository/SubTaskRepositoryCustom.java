package com.example.mysqlrepository;

import java.util.List;

import com.example.entity.Subtask;
import com.example.entity.Task;


public interface SubTaskRepositoryCustom {
	
	List<Subtask> getAllSubTasksByTaskId(Task task);

}
