package com.app.fruit;

public class Mango extends FruitBasket
{

	public Mango(String color, String name, double weight, boolean fresh)
	{
		super(color, name, weight, fresh);
		
	}
	
	
	@Override
	public String taste()
	{
		return "Sweet";
	}
	public void pulp()
	{
		System.out.println(this.getName()+" of "+this.getColor()+" color is  creating  pulp!");
	}

}
