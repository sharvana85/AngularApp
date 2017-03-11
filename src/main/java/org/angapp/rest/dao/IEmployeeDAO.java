package org.angapp.rest.dao;

import java.util.List;
import org.angapp.rest.dto.Employee;


public interface IEmployeeDAO {
	
	public Employee findByEmployee(int employeeId);
		
	public List<Employee> findAll();

}
