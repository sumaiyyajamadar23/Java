package com.app.fruit;

public class Apple extends FruitBasket
{

	public Apple(String color, String name, double weight, boolean fresh)
	{
		super(color, name, weight, fresh);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String taste()
	{
		return "Sweet and Sour";
	} 
   public void jam()
   {
	   System.out.println(this.getName()+" is  creating  jam!");
   }
}
