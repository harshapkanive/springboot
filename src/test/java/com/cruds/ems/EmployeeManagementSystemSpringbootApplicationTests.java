package com.cruds.ems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class EmployeeManagementSystemSpringbootApplicationTests {

	/*
	@Autowired
	private EmployeeRepository repo;
	
	@Test
	public void testCreateEmployee() {
		Employee e = new Employee("Subrahmanya", "AV", 50000D, "Dev");
		Employee employee = repo.save(e);
		
		assertThat(employee.getId()).isNotNull().isGreaterThan(0);
	}
	
	@Test
	public void testListAll() {
		List<Employee> list = repo.findAll();
		list.forEach(employee -> System.out.println(employee));
	}
	
	@Test
	public void testGetId() {
		Employee e = repo.findById(1).get();
		System.out.println(e);
		
		assertThat(e.getId()).isNotNull();
	}
	
	@Test
	public void testUpdateEmployee() {
		Employee e = repo.findById(1).get();
		e.setSalary(51000D);
		repo.save(e);
		System.out.println(e);
	}
	
	@Test
	public void testGetDepartment() {
		String department = "Dev";
		Employee e = repo.getDepartment(department);
		System.out.println(e);
		
		assertThat(e).isNotNull();
	}
	
	@Test
	public void testDeleteId(){
		int employeeId = 4;
		repo.deleteById(employeeId);
	}

	@Test
	public void testFindByFirstName() {
		String firstName = "Subrahmanya";
		List<Employee> employee = repo.findByFirstName(firstName);
		employee.forEach(e -> System.out.println(e)); 
		
	}
	*/
}
