package com.cruds.ems;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public List<Employee> listAll() {
		return repo.findAll();
	}

	public Employee saveEmployee(Employee e) {
		return repo.save(e);
	}

	public Employee getEmployeeId(Integer id) {
		return repo.findById(id).get();
	}

	public Employee updateSalary(Integer id, Double salary) {
		Employee employee = repo.findById(id).orElse(null);
		if (employee != null) {
			employee.setSalary(salary);
			return repo.save(employee);
		}
		return null;
	}
	
	public Employee updateEmployee(Integer id, Employee employeeDetails) {
        Employee employee = repo.findById(id).orElse(null);
        if (employee != null) {
            employee.setFirstName(employeeDetails.getFirstName());
            employee.setLastName(employeeDetails.getLastName());
            employee.setSalary(employeeDetails.getSalary());
            employee.setDepartment(employeeDetails.getDepartment());
            return repo.save(employee);
        }
        return null;
    }
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	public Employee getDepartment(String department) {
		return repo.getDepartment(department);
	}

	public List<Employee> findByFirstName(String firstName) {
		return repo.findByFirstName(firstName);
	}

	public List<Employee> searchEmployee(String firstName, String department) {
		if (firstName != null && department != null) {
			return repo.searchEmployeeByFirstNameAndDepartment(firstName, department);
		} else {
			return repo.findAll();
		}
	}

	public List<Employee> searchEmployeeByName(String firstName) {
		if (firstName != null) {
			return repo.findByFirstName(firstName);
		}
		else {
			return repo.findAll();
		}
	}
}
