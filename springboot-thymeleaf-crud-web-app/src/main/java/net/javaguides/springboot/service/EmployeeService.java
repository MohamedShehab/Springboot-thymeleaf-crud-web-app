package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Employee;

public interface EmployeeService {
	
	// get all employees
	List<Employee> getAllEmployees();
	
	// add new employee
	void saveEmployee(Employee employee);
	
	// update employee
	Employee getEmployeeById(long id);
	
	// delete employee by id
	void deleteEmployeeById(long id);
	
	Page < Employee > findPaginated(int pageNo, int pageSize);

}
