package com.day5;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{

	private static int idGenerator;
	private int cust_id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	
	//constr for cust.registration
	public Customer(String firstName, String lastName, String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
	    this.cust_id=++idGenerator;
	
	}
	//PK based constr
	public Customer(String email) {
		this.email=email;
	}
	
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob
				+ ", plan=" + plan + "]";
	}
	public String getEmail() {
		return email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	@Override
	public boolean equals(Object o)
	{
	System.out.println("In cust equals");
	if(o instanceof Customer)
		return this.email.equals(((Customer)o).email);
		return false;
	}
	
	
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int compareTo(Customer anotherCustomer) {
		
		return this.email.compareTo(anotherCustomer.email);
	}
	
	public double getRegistrationAmount() {
		return registrationAmount;
	}


	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}
	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
	
	
}
