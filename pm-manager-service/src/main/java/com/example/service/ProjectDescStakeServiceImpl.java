package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ProjectDescStake;
import com.example.mongorepository.ProjectDescStakeRepository;

@Service
public class ProjectDescStakeServiceImpl implements ProjectDescStakeService {
	
	@Autowired
	private ProjectDescStakeRepository projectDescStakeRepository;

	@Override
	public ProjectDescStake saveProjectDesc(ProjectDescStake projectDescStake) {
		// TODO Auto-generated method stub
		return projectDescStakeRepository.save(projectDescStake);
	}

}