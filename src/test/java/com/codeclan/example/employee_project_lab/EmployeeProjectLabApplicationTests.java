package com.codeclan.example.employee_project_lab;

import com.codeclan.example.employee_project_lab.models.Department;
import com.codeclan.example.employee_project_lab.models.Employee;
import com.codeclan.example.employee_project_lab.models.Project;
import com.codeclan.example.employee_project_lab.repositories.DepartmentRepository;
import com.codeclan.example.employee_project_lab.repositories.EmployeeRepository;
import com.codeclan.example.employee_project_lab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeProjectLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployeeAndDepartment() {
		Department department = new Department("Finance");
		Employee employee = new Employee("Hanna", "Abbott", "12BE6", department);
		department.addEmployee(employee);
		departmentRepository.save(department); //why does department need to have list of employees?
		employeeRepository.save(employee);
	}

	@Test
	public void canCreateManyToMany(){
		Department department = new Department("Finance");
		Employee employee = new Employee("Hanna", "Abbott", "12BE6", department);
		Project project = new Project(13,"restructure");
		Project project2 = new Project(12,"refinance");
		Employee employee2 = new Employee("Harrison", "Booth", "13BE6", department);

		departmentRepository.save(department);
		employeeRepository.save(employee);
		employeeRepository.save(employee2);
		project.addEmployee(employee);
		project.addEmployee(employee2);
		project2.addEmployee(employee);
		projectRepository.save(project);
		projectRepository.save(project2);
	}

}

