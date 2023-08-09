package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Project;
import com.example.service.ProjectService;

@RestController
@RequestMapping("/api")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("/createProject")
	public Project createProject(@RequestBody Project project)
	{
		if(project==null)
		{
			return null;
		}
		return projectService.createProject(project);
	}
	
	@GetMapping("/getProject")
	public List<Project> getAllProject()
	{
		return projectService.getAllProject();
	}
}
