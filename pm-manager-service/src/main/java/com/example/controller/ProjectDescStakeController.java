package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ProjectDescStake;
import com.example.service.ProjectDescStakeService;

@RestController
@RequestMapping("/projectDesc")
@CrossOrigin(origins = "*")
public class ProjectDescStakeController {
	@Autowired
	private Environment env;
	@Autowired
	private ProjectDescStakeService projectDescStakeService;
	
	@LoadBalanced
	@PostMapping(value = "/saveProjectDesc")
	public ProjectDescStake saveProjectDesc(@RequestBody ProjectDescStake projectDescStake) {
		System.out.println(env.getProperty("server.port"));
		return projectDescStakeService.saveProjectDesc(projectDescStake);
		
	}
}
