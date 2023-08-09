package com.example.service;

import java.util.List;

import com.example.entity.Project;

public interface ProjectService {

	Project createProject(Project project);
	
	List<Project> getAllProject();
}
