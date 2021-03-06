package org.angapp.rest.bo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.angapp.rest.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper {
	
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeid(rs.getInt("employeeid"));
		employee.setFirstname(rs.getString("firstname"));
		employee.setAge(rs.getInt("age"));
		return employee;
	}

}
