package com.example.composite;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectMemberComposite implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long employeeId;
	
	private Long projectId;
}
