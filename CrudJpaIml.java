/*
package com.demo.app.empldetails;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.app.Employe.Employee;

@Repository
public class CrudJpaIml implements EmployeeDAO {
	
	
	private EntityManager enitity;
	
	@Autowired
	public CrudJpaIml(EntityManager enitity) {
		super();
		this.enitity = enitity;
	}

	@Override
	public List<Employee> findAll() {
		Query query=enitity.createQuery("from employe");
		
		List<Employee> empl=query.getResultList();
		return empl;
	}

	@Override
	public Employee findById(int theid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee theemployee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmploye(int theid) {
		// TODO Auto-generated method stub

	}

}
*/

