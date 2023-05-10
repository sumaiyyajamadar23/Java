package Tester;

import java.util.Scanner;

import RunnableTsks.AveragePrint;
import RunnableTsks.EvenPrinter;
import RunnableTsks.Oddprints;

public class TestConcurency 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter: range:Begin and end");
			int stat=sc.nextInt();
			int end=sc.nextInt();
			//implements:Runnable:Tread(Runnable instance,string name)
			Thread t1=new Thread(new EvenPrinter(stat, end),"Even");
			Thread t2=new Thread(new Oddprints(stat, end),"Odd");
			Thread t3=new Thread(new AveragePrint(stat, end),"Average");
			
			t1.start();
			t2.start();
			t3.start();
			System.out.println("Main waiting for child execution");
			t1.join();
			t2.join();
			t3.join();
		}
       catch(Exception e)
		{
    	   e.printStackTrace();
	System.out.println("");
		}
		System.out.println(" Main oveerrrr!!!!!!!!!");
	}
}
