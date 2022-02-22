package com.demo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.app.Employe.Employee;
import com.demo.app.empldetails.EmployeeDAO;

@Service
public class CrudServiceimpl implements CrudService {
	@Autowired
	private EmployeeDAO employeda;
	
	

	public CrudServiceimpl(EmployeeDAO employeda) {
		
		this.employeda = employeda;
	}

	@Override
	@Transactional
	public Employee addId(int theid) {
		return employeda.findById(theid);
		
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeda.findAll();

	}

	@Override
	@Transactional
	public void save(Employee theemployee) {
		employeda.save(theemployee);

	}

	@Override
	@Transactional
	public void deleteEmploye(int theid) {
		deleteEmploye(theid);

	}

}
