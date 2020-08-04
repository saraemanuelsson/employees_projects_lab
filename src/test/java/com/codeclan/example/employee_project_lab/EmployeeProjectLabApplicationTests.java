package com.codeclan.example.employee_project_lab;

import com.codeclan.example.employee_project_lab.models.Department;
import com.codeclan.example.employee_project_lab.models.Employee;
import com.codeclan.example.employee_project_lab.repositories.DepartmentRepository;
import com.codeclan.example.employee_project_lab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeProjectLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployeeAndDepartment() {
		Department department = new Department("Finance");
		departmentRepository.save(department);

		Employee employee = new Employee("Hanna", "Abbott", "12BE6", department);
		employeeRepository.save(employee);
	}

}
