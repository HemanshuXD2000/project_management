package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Skills;
import com.example.mysqlrepository.SkillsRepository;

@Service
public class SkillsServiceImpl implements SkillsService {

	
	@Autowired
	private SkillsRepository skillsRepository;
	
	@Override
	public List<Skills> getAllSkills() {
		// TODO Auto-generated method stub
		return skillsRepository.findAll();
	}

}