package com.demo.app.service;

import java.util.List;

import com.demo.app.Employe.Employee;



public interface CrudService {
	public Employee addId(int theid);

	public List<Employee> findAll();

	public void save(Employee theemployee);

	public void deleteEmploye(int theid);


}
