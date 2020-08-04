package com.codeclan.example.employee_project_lab.repositories;

import com.codeclan.example.employee_project_lab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository<Project, Long> {
}
