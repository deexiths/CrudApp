package com.demo.app.Employe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")

public class Employee {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	public Employee() {

		System.out.println("in employee no-arg constructor");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
