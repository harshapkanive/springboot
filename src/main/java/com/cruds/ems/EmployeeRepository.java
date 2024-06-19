package com.cruds.ems;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


	@Query("SELECT e FROM Employee e WHERE e.department = :department")
	public Employee getDepartment(@Param("department") String department);
	
	public List<Employee> findByFirstName(String firstName);
	
	public List<Employee> searchEmployeeByFirstNameAndDepartment(String firstName, String department);
	
}
