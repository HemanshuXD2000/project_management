package com.example.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="task")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long taskId;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false,targetEntity = Project.class)
	private Project projectId;
	
	private String taskTitle;
	
	private String description;
	
	private String taskDescription;
	
	private Date startDate;
	
	private Date dueDate;
	
	private Long subTaskCount;
	
	private Long progress;
}
