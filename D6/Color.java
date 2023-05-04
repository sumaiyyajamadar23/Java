package com.code;

public enum Color
{
BLACK(1000),WHITE(2000),RED(3000),BLUE(4000);
 private double cost;
private Color(double cost)
{
	this.cost=cost;
}
public double getcost()
{
	return this.cost;
	
}
@Override
public String toString()
{
	return name()+"@"+cost;
}
}
