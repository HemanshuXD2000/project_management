package org.example.controller;

import java.util.List;

import org.example.entity.ProjectMember;
import org.example.service.ProjectMemberService;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class ProjectMemberController {
	
	private final ProjectMemberService projMemService;
	private final Environment env;
	
	@GetMapping("/project_members/status")
	public String getStatus() {
		return env.getProperty("server.port");
	}
	
	@GetMapping("/project_members/getEmp/{id}")
	public List<ProjectMember> getEmployeebyId(@PathVariable("id") long id){
		return projMemService.getByEmployeeId(id);
	}
	
	@GetMapping("/project_members/getProj/{id}")
	public List<ProjectMember> getProjectById(@PathVariable("id") long id){
		return projMemService.getByProjectId(id);
	}
	
	@GetMapping("/project_members")
	public List<ProjectMember> getAllProjects(){
		return projMemService.getAllProjects();
	}
}
