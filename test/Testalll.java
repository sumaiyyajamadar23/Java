package Testall;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import UtilsAll.IoUtils;
import UtilsAll.IoUtils.*;
import comcode.Empc;
import Validate.Validationrules;

public class Testalll {

	public static void main(String[] args)
	{
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("Enter file to restore:");
		String file=sc.nextLine();
		Map<String,Empc> map=IoUtils.restore(file);
		System.out.println("Restored map:"+map);
		boolean exit=false;
		while (!exit)
		{
			System.out.println("1. Hire new emp"
					+ "2. List all emp details"
					+ "3. Promote an emp"
					+ "4. Delete emp details"
					+ "5. Sort emps as per join date n display the same."
					+ "6. We can add many more options here..."
					+ "0. Exit");
			System.out.println("Enter your choice");
			try
			{
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter details:");
				Empc e=Validationrules.validateAll(sc.next(), sc.next(), sc.next(), sc.next(), map);
				map.put(e.getId(), e);
				System.out.println("Hiredddd!!!");
				break;
			case 2:
				map.values()
				.stream()
				.forEach(e1->System.out.println(e1));
				break;
			case 3:
				//3. Promote an emp
				break;
			case 4:
				System.out.println("Enter id to delete:");
				String i=sc.next();
				map.values()
				.removeIf(p -> p.getId().equals(i));
				
				break;
			case 0:
				exit=true;
				IoUtils.store(file, map);
				break;
			}
				
			}
			catch(Exception e)
			{
				System.out.println(e);
				sc.nextLine();
			}
		}
	}
	}

}
