package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Emp implements Serializable 
{
//2.2 Emp details : id(string), first name , last name , 
//dept(enum : RND,HR,SALES,FINANCE,PRODUCTION), joining date(LocalDate)
	private String id;
	private String firstName;
	private String lastName;
	private Dept dept;
	private LocalDate joiningDate;
	public Emp(String id, String firstName, String lastName, Dept dept, LocalDate joiningDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept
				+ ", joiningDate=" + joiningDate + "]";
	}
	public String getId() {
		return id;
	} 
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public Dept getDept()
	{
		return dept;
	}
	
	public LocalDate getJoiningDate() 
	{
		return joiningDate;
	}
	//Since HashMap 
	
	
	
	
	
	
}
