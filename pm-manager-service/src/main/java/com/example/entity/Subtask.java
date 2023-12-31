package com.example.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "subtask")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Subtask implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sub_task_id")
	private Long subTaskId;
	

	@ManyToOne(fetch = FetchType.LAZY,optional=true,targetEntity = Task.class)
    @JoinColumn(name="task_id")
	private Task taskId;	
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional=false,targetEntity = Employee.class)
	@JoinColumn(name = "employee_id")
	private Employee employeeId;
	
	@Column(name = "sub_task_title")
	private String subTaskTitle;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name = "sub_task_description")
	private String subTaskDescription;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "due_date")
	private Date dueDate;
	
	@Column(name = "progress_percentage", columnDefinition = "bigint default 0")
	private Long progressPercentage;
}
