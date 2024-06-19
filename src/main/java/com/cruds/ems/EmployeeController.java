package com.cruds.ems;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/employees")
	public List<Employee> listAll() {
		return service.listAll();
	}

	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee e) {
		return service.saveEmployee(e);
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {
		return service.getEmployeeId(id);
	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployeeById(@PathVariable Integer id) {
		service.deleteEmployee(id);
	}

	@PutMapping("/employees/{id}/salary")
	public Employee updateSalary(@PathVariable Integer id, @RequestParam Double newSalary) {
		return service.updateSalary(id, newSalary);
	}
	
	 @PutMapping("/employees/{id}")
	    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employeeDetails) {
	        return service.updateEmployee(id, employeeDetails);
	    }

	@GetMapping("/employees/department/{department}")
	public Employee getDepartment(@PathVariable String department) {
		return service.getDepartment(department);
	}

	@GetMapping("/employees/search")
	public List<Employee> searchEmployee(@RequestParam("firstName") String firstName,
			@RequestParam("department") String department) {
		return service.searchEmployee(firstName, department);
	}

	@GetMapping("/employees/firstName/{firstName}")
	public List<Employee> searchEmployeeByName(@PathVariable String firstName) {
		return service.searchEmployeeByName(firstName);
	}

}
