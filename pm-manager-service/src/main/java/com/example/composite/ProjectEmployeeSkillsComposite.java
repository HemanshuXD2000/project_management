package com.example.composite;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ProjectEmployeeSkillsComposite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long employeeId;
	private Long skillId;
}
