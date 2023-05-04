package com.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static com.day5.ValidationRules.*;
public class CustomerRegistrationTester 
{

	public static void main(String[] args) 
	{

		try(Scanner sc=new Scanner(System.in))
		{
			//linit
			//create empty AL to hold customer refs
			List<Customer>cutomerList=new ArrayList<>();
			boolean exit = false;
			while (!exit)
			{
				System.out.println(
						"0. Exit 1. Sign Up 2. Sign In 3.Display all " +
				        "4. Change Password 5.sort as per email "
					  + "6.Sort customer as per dob and regamt"
					  + " 7.sort as per dob and regAmount");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:// customer reg.
						System.out.println(
								"Enter customer details :  firstName,  lastName,  email,  password,  regAmount,  dob service Plan");
						Customer validCustomer = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(),cutomerList);
						cutomerList.add(validCustomer);
						System.out.println("customer registered....");

						break;
					case 2: // sign in
						System.out.println("Enter email n password");
						validCustomer = customerLogin(sc.next(), sc.next(),cutomerList);
						System.out.println(validCustomer);
						break;

					case 3:
						System.out.println("All customers ");
						for (Customer c : cutomerList)
							System.out.println(c);
						break;

					case 4: // change password
						System.out.println("Enter email , old pwd , new pwd");
						validCustomer = customerLogin(sc.next(), sc.next(), cutomerList);
						// => valid login
						validCustomer.setPassword(sc.next());
						break;
					case 5:
						Collections.sort(cutomerList);
						System.out.println("sorted!!!");
						break;
					case 6:
						Collections.sort(cutomerList,new Comparator<Customer>()
						{
							@Override
							public int compare(Customer o1, Customer o2) {
								int ret=o1.getDob().compareTo(o2.getDob());
								if(ret==0)
								{
//									if(o1.getRegistrationAmount()>o2.getRegistrationAmount())
//										return 1;
//									if(o1.getRegistrationAmount()<o2.getRegistrationAmount())
//										return -1;
//									return 0;
									return ((Double)o1.getRegistrationAmount()).compareTo(o2.getRegistrationAmount());
								}	
								return ret;
							
							}
						});
						
						
						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// read off pending token from the scanner till EOL (end of line)
					sc.nextLine();
				}
			}
	}
		
	}

}
