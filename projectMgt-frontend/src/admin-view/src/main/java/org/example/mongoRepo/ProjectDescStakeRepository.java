package org.example.mongoRepo;

import java.util.List;

import org.example.model.ProjectDescStake;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface ProjectDescStakeRepository extends MongoRepository<ProjectDescStake, String> {
	
	 List<ProjectDescStake> findByProjectId(Long theId);
}
