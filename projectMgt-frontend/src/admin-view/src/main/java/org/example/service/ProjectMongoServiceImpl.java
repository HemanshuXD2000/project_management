package org.example.service;

import java.util.List;

import org.example.model.ProjectDescStake;
import org.example.mongoRepo.ProjectDescStakeRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProjectMongoServiceImpl implements ProjectMongoService {
	
	private final ProjectDescStakeRepository mongoRepo;
	@Override
	public List<ProjectDescStake> getProjectDetails(Long theId) {
		// TODO Auto-generated method stub
		return mongoRepo.findByProjectId(theId);
	}

}
