package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.SubTask;
import com.example.repository.SubtaskRepository;

@Service
public class SubtaskServiceImpl implements SubtaskService {

	@Autowired
	private SubtaskRepository subTaskRepo;
	
	@Override
	public void getAllSubtasks() {
	
		List<SubTask> subTasks = subTaskRepo.findAll();
		System.out.println(subTasks.toString());
		
	}

	@Override
	public SubTask createSubTask(SubTask subTask) {
		return subTaskRepo.save(subTask);
	}

}
