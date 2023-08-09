package com.example.mysqlrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Project;


public interface ProjectRepository extends JpaRepository<Project, Long>, ProjectRepositoryCustom
{
		

}
