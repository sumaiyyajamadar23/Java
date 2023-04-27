package com.tester;

import com.app.fruit.Apple;
import com.app.fruit.FruitBasket;
import com.app.fruit.Mango;
import com.app.fruit.Orange;

import static java.lang.System.*;

import java.util.Scanner;

public class FruitTester {

	public static void main(String[] args) 
	{
		int ch;
		Scanner sc=new Scanner(in);
		System.out.println("Enter size of basket:");
	 FruitBasket[] basket=new FruitBasket[sc.nextInt()];
	 System.out.println("1.Add Mango");
	 System.out.println("2.Add Orange");
	 System.out.println("3.Add Apple");
	 System.out.println("4. Display names of fruits");
	 System.out.println("5.Display details of fruits");
	 System.out.println("6.Mark fruit");
	 System.out.println("7.Stale fruit");
	 System.out.println("8.Display fruit specific functionality");
	 System.out.println("9.Exit");
	 int index=0;
	do
	{
		 System.out.println("Enter choice:");
		 ch=sc.nextInt();	
	 switch(ch)
	 {
	 case 1:
		 if(index<basket.length)
			{
			System.out.println("colour,name,weight,fresh");	
			Mango m= new Mango(sc.next(),sc.next(),sc.nextDouble(),sc.nextBoolean());
			basket[index]=m;
			index++;
			}
			else
			{
				System.out.println("Basket is full");
			}
			break;
		 
	 case 2: 
		 if(index<basket.length)
			{
			System.out.println("colour,name, weight, fresh");	
			Orange o= new Orange(sc.next(),sc.next(),sc.nextDouble(),sc.nextBoolean());
			basket[index]=o;
			index++;
			}
			else
			{
				System.out.println("Basket is full");
			}
		 break;
	 case 3:
		 if(index<basket.length)
			{
			System.out.println("colour, name,weight, fresh");	
			Apple a= new Apple(sc.next(),sc.next(),sc.nextDouble(),sc.nextBoolean());
			basket[index]=a;
			index++;
			}
			else
			{
				System.out.println("Basket is full");
			}
		 break;
	 case 4: 
		  for(FruitBasket f: basket)
		  {
			  if(f != null)
				 {
			  System.out.println(f.getName());
				 }
		  }
		 break;
	 case 5: 
		 for(FruitBasket f: basket)
		  {
			 if(f != null)
			 {
			  System.out.println(f.toString());
			 }	
		 }
		 break;
	 case 6:
		 for(FruitBasket f: basket)
		  {
			 if(f != null)
			 {
				 if(f.isFresh())
					 System.out.println("Fruit is fresh");	
				 else
					 System.out.println("Fruit is stale");
			 }
		 }
		 break;
	 case 7:
		 String str="Sour";
		 for(FruitBasket f: basket)
		  {
			 if(f!=null)
			 {
			 if(f.taste().contains(str))
				 System.out.println("Stale");
			 else
				 System.out.println("not stale");
			 }
		 }
		 break;
	 case 8: 
	 for(FruitBasket f: basket)
	 {
		 if(f!=null)
		 {
		  if(f instanceof Mango)
			  ((Mango) f).pulp();
		  else if(f instanceof Orange)
		    ((Orange) f).juice();
		  else if(f instanceof Apple) 
			  ((Apple) f).jam();
		  else
			  System.out.println("No specific functionality");
		 }
	 }
		 break;
	 case 9:System.exit(0);
	     default:
	    	 System.out.println("Invalid choice...Try again....!");
	   }//switch
	
	 }while(ch!=9);
   }
}
