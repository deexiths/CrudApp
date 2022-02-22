package com.demo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.Employe.Employee;
import com.demo.app.service.CrudServiceimpl;


@RestController
@RequestMapping("/aappii")
public class RestControllers {

	@Autowired
	private CrudServiceimpl service;

	
	public RestControllers(CrudServiceimpl serviceed) {

		this.service = serviceed;
	}


	@GetMapping("/Employees")
	public List<Employee> findingAll() {
		return service.findAll();
	}
	//get getiing employee by employee id
	@GetMapping("/Employees/{employeeid}")
	public Employee getEmployee(@PathVariable int employeeid)
	{
			Employee empl=service.addId(employeeid);
			
			return empl;
	}
	
	//add maping for  post//adding new employee
	@PostMapping("/Employees")
	public Employee addEmployee(@RequestBody Employee theEmploye)
	{
		//forse to json add new item
		theEmploye.setId(0);
		service.save(theEmploye);
		
		return theEmploye;
	}
	//updating employee
	@PutMapping("/Employees")
	public Employee updateEmployee(@RequestBody Employee theEmploye)
	{
		
		service.save(theEmploye);
		
		return theEmploye;
	}
	
	//add maping for deleteEmploye
	@DeleteMapping("/Employee/{employeId}")
	public Employee deleteEmplo(@PathVariable int employeId)
	{
		Employee empl=service.addId(employeId);
		if(empl==null)
		{
			throw new RuntimeException("there is no employee");
		}
		
		service.deleteEmploye(employeId);
		
		return empl;
	}
	
	
	
	
	
	
	
	
	
	
	
}

