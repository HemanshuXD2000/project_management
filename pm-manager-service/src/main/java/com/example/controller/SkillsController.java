package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Skills;
import com.example.service.SkillsService;

@RestController
@RequestMapping(value = "/skill")
public class SkillsController {
	@Autowired
	private Environment env;
	
	@Autowired
	private SkillsService skillsService;
	
	@LoadBalanced
	@GetMapping(value = "/getAllSkills")
	public List<Skills> getAllSkills(){
		System.out.println(env.getProperty("server.port"));
		return skillsService.getAllSkills();
	}

}
