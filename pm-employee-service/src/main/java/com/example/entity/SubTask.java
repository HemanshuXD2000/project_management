package com.example.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="subtask")
public class SubTask {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subTaskId;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = true,targetEntity = Employee.class)
	private Task taskId;
	
	@OneToOne(fetch = FetchType.LAZY,optional = false,targetEntity = Employee.class)
	private Employee employeeId;
	
	private String subTaskTitle;
	
	private String subTaskDescription;
	
	private Date startDate;
	
	private Date dueDate;
	
	private Long progessPercentage;
}
