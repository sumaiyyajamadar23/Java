package Tester;

import java.util.Scanner;

import utils.ValidationRules;
import utils.ValidationRules.*;
import com.code.Vehicle;

public class ShowroomTeste {

	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter size of showroom:");
			Vehicle [] varr=new Vehicle[sc.nextInt()];
			boolean exit=false;
			while(!exit)
			{   
				System.out.println("1.ada new vehicle 2.display all vehicle ");
				System.out.println("Enter your choice:");
				try
				{
					switch(sc.nextInt())
					{
					case 1:
				//Add new vehicle to showrooom
						//chno,price,vcolor,manufacture,company
						Vehicle vehicl=ValidationRules.ValidateAll(sc.next(),sc.nextDouble(), sc.next(), sc.next(), sc.next(), varr);
						break;
					case 2:
						System.out.println();
						break;
					case 0:
						//System.exit(0);
						exit=true;
						break;
					default:
						System.out.println("Invalid choice!!!");
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
