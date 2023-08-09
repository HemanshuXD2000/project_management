package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.SubtaskService;

@RestController
@RequestMapping("/api")
public class SubtaskController {
	
	@Autowired
	private SubtaskService subtaskService;
	
	@GetMapping("/getsubtasks")
	public void getAllSubtasks()
	{
		subtaskService.getAllSubtasks();
	}
}
