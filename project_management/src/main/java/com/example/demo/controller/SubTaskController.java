package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SubTask;
import com.example.demo.service.SubTaskService;

import lombok.AllArgsConstructor;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class SubTaskController {
	
	private final SubTaskService subTaskService;
	
	
	@GetMapping("/getsubtasks/{empId}")
	public List<SubTask> getAllSubTasks(@PathVariable Long empId){
		
		return subTaskService.getAllSubtasks(empId);
	}
	
	
	@PutMapping("/updateProgress/{subtaskId}/{progressPercentage}/{comment}")
	public ResponseEntity<?> updateProgress(@PathVariable(value = "subtaskId") Long subtaskId, 
			@PathVariable(value = "progressPercentage") Long progressPercentage, 
			@PathVariable(value="comment") String comment) {

		subTaskService.updateProgress(subtaskId, progressPercentage, comment);
		return ResponseEntity.status(HttpStatus.OK).body(progressPercentage);
		
	}
	
	

}
