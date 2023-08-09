package com.example.service;

import java.util.List;

import com.example.entity.Project;

public interface ProjectService {

	public Project saveProject(Project project);
	public List<Project> getAll();
	public Project getProjectById(Long projectId);
	public boolean completeProject(Project project);
}
