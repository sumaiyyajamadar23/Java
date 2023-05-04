package Tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.code.Vehicle1;

public class Showroom1
{

	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in))	
	{
		List<Vehicle1>vehicleList=new ArrayList<Vehicle1>();
		//List<Customer> customerList = new ArrayList<>();
		boolean exit=false;
		while(!exit)
		{
			System.out.println("Options 1. Add a Vehicle 2. Display all "
					+ "3. Get specific vehicle details 4. Apply discount  "
					+ "5. Delete vehicle details  by ch no 6. Delete vehicles by color "
					+ "7. Sort the vehicles as per ch no " + "8. Sort the vehicles as per price "
					+ "9. Sort the vehicles as per date n price " + "10. Sort the vehicles as per date 0. Exit");
			System.out.println("Enter your choice");
		try
		{
			switch(sc.nextInt())
			{
			case 0:System.exit(0);
				break;
			case 1:
				System.out.println();
				break;
			}
		}
       catch(Exception e)
		{
	 System.out.println(" Exception");
		}
        }
	}
		
	}

}
