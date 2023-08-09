package com.example.composite;

import java.io.Serializable;

import com.example.entity.Employee;
import com.example.entity.Project;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class ProjectMemberComposite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Employee employeeId;
	
	private Project projectId;
}
