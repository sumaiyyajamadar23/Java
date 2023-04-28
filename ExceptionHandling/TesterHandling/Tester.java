package TesterHandling;

import static utils.Validation.*;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter your current speed");
			ValidateSpeed(sc.nextInt());
			System.out.println("Enter Your date in dd-MM-YYY format");
            ValidateLicence(sc.next());
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		System.out.println("********");
		e.printStackTrace();
		
	    }
		System.out.println("End of main");


	}

}
