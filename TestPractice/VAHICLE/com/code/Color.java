package com.code;

public enum Color 
{
BLACK(2000),WHITE(1800),BLUE(1600),RED(1500),PURPLE(2200);

private double cost;

Color(double cost)
{
	this.cost=cost;
}

/**
 * @return the cost
 */
public double getCost() {
	return cost;
}
	
}
