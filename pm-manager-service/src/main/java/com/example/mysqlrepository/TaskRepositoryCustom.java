package com.example.mysqlrepository;

import java.util.List;

import com.example.entity.Task;

public interface TaskRepositoryCustom {
	
	List<Task> getAllTasksByProjectId(Long projectId);
	
	

}
