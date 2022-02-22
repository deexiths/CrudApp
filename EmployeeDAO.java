package com.demo.app.empldetails;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.app.Employe.Employee;

public interface EmployeeDAO {
public List<Employee> findAll();
	
	public Employee findById(int theid);
	
	public void save(Employee theemployee);
	public void deleteEmploye(int theid);

}
