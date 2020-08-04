package com.codeclan.example.employee_project_lab.repositories;

import com.codeclan.example.employee_project_lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
