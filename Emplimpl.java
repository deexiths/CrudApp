package com.demo.app.empldetails;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.app.Employe.Employee;
@Repository
public class Emplimpl implements EmployeeDAO{

	private EntityManager entitymanager;

	public Emplimpl() {
		// TODO Auto-generated constructor stub
	}
	// setup the constructor injection
	@Autowired
	public Emplimpl(EntityManager theentitymanager) {
		entitymanager = theentitymanager;
	}

	@Override
	public List<Employee> findAll() {
		Session currentsesstion = entitymanager.unwrap(Session.class);
		// create quary
		Query<Employee> theQuary = currentsesstion.createQuery("FROM Employee", Employee.class);
		// execute a quary and get a result
		List<Employee> employeelist = theQuary.getResultList();

		// return the results

		return employeelist;

	}

	@Override
	public Employee findById(int theid) {
		// get the current hibernate session
		Session currentsesstion = entitymanager.unwrap(Session.class);
		// get the employee
		Employee empl = currentsesstion.get(Employee.class, theid);
		return empl;
	}

	@Override
	public void save(Employee theemployee) {
		// get the current hibernate session
		Session currentsesstion = entitymanager.unwrap(Session.class);
		// if the id=0 then save or insert else update
		// save employee
		currentsesstion.saveOrUpdate(theemployee);

	}

	@Override
	public void deleteEmploye(int theid) {
		// get the current hibernate session
		Session currentsesstion = entitymanager.unwrap(Session.class);
		Query<Employee> theQuary = currentsesstion.createQuery("delete from employee where id=:id");
		theQuary.setParameter("id", theid);
		theQuary.executeUpdate();

	}

}
