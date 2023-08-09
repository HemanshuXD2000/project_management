package com.example.mysqlrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Skills;


public interface SkillsRepository extends JpaRepository<Skills, Long>
{
		

}
