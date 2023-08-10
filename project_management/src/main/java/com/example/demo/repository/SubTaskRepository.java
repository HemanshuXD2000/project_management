package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.SubTask;
import com.example.demo.entity.Task;

@Repository
public interface SubTaskRepository extends JpaRepository<SubTask, Long>{

	@Query
	public List<SubTask> findByEmployeeId(Optional<Employee> emp);
	
	@Query
	public SubTask findBySubTaskId(Long subtaskId);
	
	@Query
	public List<SubTask> findByTaskId(Task taskId);
	
}
