package Tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static utils.IoUtils.*;

import com.app.core.Dept;
import com.app.core.Emp;
import static utils.EmpUtils.*;
import static utils.ValidationRules.*;

public class CustomTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file name:");
		//Map<String, Emp> custMapMap = populateCustomMap();
			String file=sc.nextLine();
			restore(file);
		Map<String, Emp> custMapMap=restore(file);
		System.out.println("Restored map:"+custMapMap);
		boolean exit=false;
		while(!exit)
		{System.out.println("1. Hire new emp"
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
					//1. Hire new emp
					System.out.println("Enter Details:id,firstName,lastName,dept, joiningDate");
				Emp newEmp=ValidateAll(sc.next(), sc.next(), sc.next(), sc.next(),sc.next(), custMapMap);
					custMapMap.put(newEmp.getId(), newEmp);
					System.out.println("New Employee:"+newEmp.getFirstName()+"Is hired");
					break;
				case 2:
					System.out.println("All Employee Etails:");
					custMapMap.values()
					.stream()
					.forEach(System.out::println);
					//2. List all emp details
					break;
				case 3:
					//3. Promote an emp
					break;
				case 4:
					///4. Delete emp details
					System.out.println("Enter id:");
					String id=sc.next();
					 custMapMap.values()
					.removeIf(s->s.getId().equals(id));
					
					break;
				case 5:
					System.out.println("Enter date to remove:");
				custMapMap.values()
					.stream()
					.sorted((p1,p2)->(p1.getJoiningDate()).compareTo(p2.getJoiningDate()))
					.forEach(System.out::println);
					//5. Sort emps as per join date n display the same.
					break;
				case 0:
					exit=true;
					StoreCustomDetail(file, custMapMap);
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
				sc.nextLine();			}
		}
//			System.out.println("Enter file name to Seri");
//			StoreCustomDetail(sc.next(), custMapMap);
//			System.out.println("File stored");
//		   System.out.println("Enter file To Dseri:");
//		restore(sc.next());
//		System.out.println("File restores");
			System.out.println("Enter");
		}
    catch(Exception e)
		{
	     System.out.println(e);
		}
	}

}
