package org.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.example.composite.ProjectMemberComposite;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "project_member")
@IdClass(ProjectMemberComposite.class)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class ProjectMember implements Serializable {
	
	@Id
	@ManyToOne(optional=false,targetEntity = Employee.class)
    @JoinColumn(name="employee_id")
	private Employee employeeId;
	
	@Id	
	@ManyToOne(optional=true,targetEntity = Project.class)
    @JoinColumn(name="project_id")
	private Project projectId;
	
	@Column(name="authority", columnDefinition = "boolean default 1")
	private boolean authority;
}
