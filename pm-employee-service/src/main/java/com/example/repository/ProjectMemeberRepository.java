package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.composite.ProjectMemberComposite;
import com.example.entity.ProjectMember;

public interface ProjectMemeberRepository extends JpaRepository<ProjectMember, ProjectMemberComposite> {

	public List<ProjectMember> findByEmployeeId(Long theId);
}
