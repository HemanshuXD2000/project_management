package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="task")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Task implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_Id")
	private Long taskId;
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY,optional=false,targetEntity = Project.class)
    @JoinColumn(name="project_id")
	private Project projectId;
	
	@Column(name = "task_title")
	private String taskTitle;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "due_date")
	private Date dueDate;
	
	@Column(name = "sub_task_count", columnDefinition = "bigint default 0")
	private Long subTaskCount;
	
	@Column(name = "progress")
	private Long progress;

}
