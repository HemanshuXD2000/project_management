package com.example.demo.dao;

public interface SubTaskDao {
	
	public void updateProgress(Long subTaskId, Long progressPercentage, String comment);

}
