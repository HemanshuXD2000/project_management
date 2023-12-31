package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Project;
import com.example.service.ProjectService;

@RestController
@RequestMapping(value = "/project")
@CrossOrigin(origins = "*")
public class ProjectController {
	@Autowired
	private Environment env;
	
	@Autowired
	private ProjectService projectService;	
	
	@LoadBalanced
	@GetMapping("/Project")
	public List<Project> getAll(){	
		System.out.println(env.getProperty("server.port"));
		return projectService.getAll();		
	}
	
	@LoadBalanced
	@PostMapping("/Project")
	public Project saveProject(@RequestBody Project project) {	
		System.out.println(env.getProperty("server.port"));
		return projectService.saveProject(project);
	}
	
	@LoadBalanced
	@GetMapping("/ProjectById/{projectId}")
	public Project getProjectById(@PathVariable Long projectId){
		System.out.println(env.getProperty("server.port"));
		return projectService.getProjectById(projectId);		
	}
	
	
	@LoadBalanced
	@PutMapping("/CompleteProject")
	public boolean completeProject(@RequestBody Project project) {
		System.out.println(env.getProperty("server.port"));
		return projectService.completeProject(project);
		//return true;
	}
}
