package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.SubTask;

public interface SubtaskRepository extends JpaRepository<SubTask, Long>{

	public List<SubTask> findByEmployeeId(Long theId);
}
