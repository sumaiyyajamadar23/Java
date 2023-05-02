package com.code;

public enum color 
{
BLACK(2000),WHITE(3000),BLUE(4000),RED(1000),PURPLE(5000),ORANGE(950);
	@SuppressWarnings("unused")
	private double cost;
	
	private color (double cost)
	{
	this.cost=cost;	
	}

	public double getCost() {
		return cost;
	}
	@Override
	public String toString()
	{
		return name()+"@"+getCost();//cost
	}
}
