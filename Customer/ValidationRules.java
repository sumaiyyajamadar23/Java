package com.day5;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class ValidationRules 
{
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password, double registrationAmount,
			String dob, String plan,List<Customer>customerList)throws CustomException
	{
		CheckForDuplicate(customerList, email);
		ServicePlan serviceplan=ValidateAndParse(plan, registrationAmount);
		LocalDate validatedob=validatedob(dob);
		
		
		return new Customer(firstName, lastName, email, password,registrationAmount,
			validatedob,serviceplan);
		
	}
	
//add a static method for no duplicate customer hint:public static void checkForDuplicate(email) api:constains
	public static void CheckForDuplicate(List<Customer>customerList,String newEmail) throws CustomException
	{
		//Wrap email in customer reference
	Customer newCustomer=new Customer(newEmail);
	if(customerList.contains(newCustomer))
		throw new CustomException("Duplicate email id,choose new email");
		System.out.println("No duplicate email found");
	}
	public static ServicePlan ParseAndvalidate(String planName)throws IllegalArgumentException
	{
		return ServicePlan.valueOf(planName.toUpperCase());
	}
	public static void validateRegistrationAmount(double price,ServicePlan chosenPlan) throws CustomException
	{
		if(chosenPlan.getPlancost()==price)
			System.out.println("Registered!!!!");
		throw new CustomException("Invalid Amount for chosen plan");
	}
	
	//public static Customer ValidateAllAndParse(String planName,double price,ServicePlan chosenPlan) throws CustomException
	//{
//		ParseAndvalidate(planName);
//		validateRegistrationAmount(price, chosenPlan);
//		return ServicePlan;
	//}
	public static ServicePlan ValidateAndParse(String planName,double price) throws CustomException,IllegalArgumentException
	{
		ServicePlan serviceplan=ServicePlan.valueOf(planName.toUpperCase());
		if(serviceplan.getPlancost()!=price)
			throw new CustomException("Invalid registration amount");
		return serviceplan;
	}
	
	public static LocalDate validatedob(String dob)throws CustomException
	{
		//parsing
		LocalDate date=LocalDate.parse(dob);
		//parsing successful
		int ageInYears=Period.between(date, LocalDate.now()).getYears();
		if(ageInYears>21)
			return date;
		throw new CustomException("Invalid dob");
		
	}
	public static Customer customerLogin(String email,String pass,List<Customer>custList) throws CustomException
	{
		int index=custList.indexOf(new Customer(email));
		if(index==-1)
			throw new CustomException("Invalid email,login failed");
		Customer validCustomer=custList.get(index);
		if(validCustomer.getPassword().equals(pass))
			System.out.println("Validate customer:"+validCustomer);
		return validCustomer;
	}
	
//validate plan
//registration amount must match with plan
	//customer must be > age 21-------lab work
}
