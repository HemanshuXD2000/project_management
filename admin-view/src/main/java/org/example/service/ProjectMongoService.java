package org.example.service;

import java.util.List;

import org.example.model.ProjectDescStake;

public interface ProjectMongoService {
	
	List<ProjectDescStake> getProjectDetails(Long theId);

}
