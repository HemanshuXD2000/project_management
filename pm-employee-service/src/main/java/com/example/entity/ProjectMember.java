package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.composite.ProjectMemberComposite;

import lombok.Data;

@Data
@Entity
@Table(name = "projectMember")
@IdClass(ProjectMemberComposite.class)
public class ProjectMember {
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY,optional = false,targetEntity = EmployeeEntity.class)
	@JoinColumn(name="team_member_id")
	private Long employeeId;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY,optional = true, targetEntity = Project.class)
	@JoinColumn(name="project_id")
	private Long projectId;
}
