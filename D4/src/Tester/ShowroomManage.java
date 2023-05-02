package Tester;

import static utils.VehicleValidationRules.validateAllInputs;

import java.util.Scanner;

import com.app.core.Vehicle;
import com.code.Vahicle;

public class ShowroomManage {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter size of showroom:");
			Vahicle[] showroom=new Vahicle[sc.nextInt()];
			boolean exit=false;
			
			int count=0;
			while(!false)
			{  
				System.out.println("0.Exit 1.Add 2.Display");
				System.out.println("Enter your choice:");
				switch(sc.nextInt())
				{
				case 1:
					if(count < showroom.length)
					{
						System.out.println(
								"Enter vehicle details : chasisNo,  vehicleColor,  base Price,  manufactureDate,  company");
						Vahicle vehicle = val(sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), showroom);
						
					}
				
				}
				
			}
		}
	}

}
