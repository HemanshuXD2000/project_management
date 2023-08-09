package com.example.mysqlrepository;


import java.util.List;

import com.example.entity.Project;
import com.example.entity.ProjectMember;

public interface ProjectMemberRepositoryCustom {

	public void saveProjectMember(ProjectMember projectMember);
	public List<ProjectMember> getProjectMemberByProjectId(Project project);
	public void updateAuthority(List<ProjectMember> projectMembersList);



}
