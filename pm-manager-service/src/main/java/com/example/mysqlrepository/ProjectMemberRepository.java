package com.example.mysqlrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.composite.ProjectMemberComposite;
import com.example.entity.Project;
import com.example.entity.ProjectMember;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, ProjectMemberComposite>, ProjectMemberRepositoryCustom
{
	List<ProjectMember> findAllByProjectId(Project project); 
}
