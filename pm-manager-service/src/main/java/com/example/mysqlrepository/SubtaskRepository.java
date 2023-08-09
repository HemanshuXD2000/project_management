package com.example.mysqlrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Subtask;


public interface SubtaskRepository extends JpaRepository<Subtask, Long>, SubTaskRepositoryCustom
{
		

}
