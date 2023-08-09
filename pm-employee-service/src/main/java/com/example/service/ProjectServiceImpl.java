package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Project;
import com.example.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public Project createProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public List<Project> getAllProject() {
		return projectRepository.findAll();
	}

}
