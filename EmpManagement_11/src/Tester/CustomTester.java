package Tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static utils.IoUtils.*;
import com.app.core.Emp;
import static utils.EmpUtils.*;
import static utils.ValidationRules.*;

public class CustomTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))
		{
		//Map<String, Emp> custMapMap = populateCustomMap();
			String file=sc.nextLine();
		Map<String, Emp> custMapMap=restore(file);
		boolean exit=false;
		while(!exit)
		{
			try
			{
				switch(sc.nextInt())
				{
				case 0:
					exit=true;
					StoreCustomDetail(file, custMapMap);
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
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
