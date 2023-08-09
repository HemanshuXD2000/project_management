package com.example.mysqlrepository;

import java.util.List;

import com.example.entity.Project;
import com.example.entity.ProjectMember;

public interface ProjectRepositoryCustom
{
    
	public List<ProjectMember> completeProject(Project project) ;
}
