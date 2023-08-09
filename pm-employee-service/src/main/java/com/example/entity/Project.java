package com.example.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long projectId;
	
	private String name;
	
	private String description;
	
	private Date startDate;
	
	private Date endDate;
	
	private String stakeholders;
	
	private Boolean isCompleted;
}
