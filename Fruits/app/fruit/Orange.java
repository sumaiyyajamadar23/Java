package com.app.fruit;

public class Orange extends FruitBasket
{

	public Orange(String color, String name, double weight, boolean fresh) 
	{
		super(color, name, weight, fresh);
		
	}
	@Override
	public String taste()
	{
		return "Sour";
	}
	public void juice()
	{
		System.out.println(this.getName()+" of weight "+this.getWeight()+" is  extracting juice!");
	}

}
