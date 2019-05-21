package com.ibm.eis.bean;

public class Employe {
	private int id, salary;
	private String name, designation , insurancescheme;
	
	public String getName() {
		return name;
	}
	
	
	public String getDesignation() {
		return designation;
	}
	
	public String getInsurancescheme() {
		return insurancescheme;
	}
	
	public int getId() {
		return id;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name = " + name + ", id = " + id + ", Salary = " + salary + ", Designation = " + designation + "]";
	}
	
}
