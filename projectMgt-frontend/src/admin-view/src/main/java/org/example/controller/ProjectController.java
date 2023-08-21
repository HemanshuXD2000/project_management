package org.example.controller;

import java.util.List;

import org.example.entity.Project;
import org.example.model.ProjectDescStake;
import org.example.service.ProjectMongoService;
import org.example.service.ProjectService;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class ProjectController {
	
	private final ProjectService projService;
	private final Environment env;
	private final ProjectMongoService projectMongoService;
	
	@GetMapping("/projects/status")
	public String getStatus() {
		return env.getProperty("server.port");
	}
	
	@GetMapping("/projects/findAll")
	public List<Project> getAllProjects(){
		return projService.getAllProjects();
	}
	
	@GetMapping("/projects/findById/{id}")
	public Project getProjectById(@PathVariable("id") Long id){
		return projService.findById(id);
	}
	
	@GetMapping("/projects/completed")
	public List<Project> getCompletedProjects(){
		return projService.findCompletedProjects();
	}
	
	@GetMapping("/projects/ongoing")
	public List<Project> getOngoingProjects(){
		return projService.findOngoingProjects();
	}
	
	@GetMapping("/projects/completed/{year}")
	public List<Project> getCompletedProjectsByStartingYear(@PathVariable("year") int year){
		return projService.findCompletedProjectsByStartDate(year);
	}
	
	@GetMapping("/projects/ongoing/{year}")
	public List<Project> getOngoingProjectsByStartingYear(@PathVariable("year") int year){
		return projService.findOngoingProjectsByStartDate(year);
	}
	
	@PostMapping("/projects/save")
	public Project addProject(@RequestBody Project project){
		return projService.addProject(project);
	}
	
	//get data from mongo
	@LoadBalanced
	@GetMapping("/projects/mongodb/{theId}")
	public List<ProjectDescStake> findByProjId(@PathVariable Long theId)
	{
		System.out.println(env.getProperty("server.port"));
		return projectMongoService.getProjectDetails(theId);
	}
}
