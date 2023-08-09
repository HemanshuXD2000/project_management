package com.example.service;

import java.util.List;

import com.example.entity.Project;
import com.example.entity.ProjectMember;

public interface ProjectMemberService {

	public void saveProjectMember(ProjectMember projectMember) ;	
	public List<ProjectMember> getAll();
	public List<ProjectMember> getProjectMemberByProjectId(Project project);

}
