package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.SubTaskDao;
import com.example.demo.entity.Employee;
import com.example.demo.entity.SubTask;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.SubTaskRepository;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class SubTaskServiceImpl implements SubTaskService{
	
	private final SubTaskRepository subTaskRepository;
	private final EmployeeRepository employeeRepository;
	private final SubTaskDao subTaskDao;
	

	@Override
	public List<SubTask> getAllSubtasks(Long employeeId) {
		
		List<SubTask> selected=new ArrayList<SubTask>();
		Optional<Employee> employee=employeeRepository.findById(employeeId);
		
		List<SubTask> subtasks=subTaskRepository.findByEmployeeId(employee);
		
		for(SubTask sub:subtasks) {
			if(sub.getProgressPercentage()!=100) {
				selected.add(sub);
			}
		}
		
		return selected;
		
	}

	@Override
	public void updateProgress(Long subTaskId, Long progressPercentage, String comment) {
		subTaskDao.updateProgress(subTaskId, progressPercentage, comment);
	}

}
