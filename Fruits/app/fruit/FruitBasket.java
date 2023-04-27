package com.app.fruit;

public class FruitBasket
{
private String color,name;
private double weight;
private boolean fresh;

public FruitBasket(String color, String name, double weight, boolean fresh)
{
	super();
	this.color = color;
	this.name = name;
	this.weight = weight;
	this.fresh = fresh;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public boolean isFresh() {
	return fresh;
}

public void setFresh(boolean fresh) {
	this.fresh = fresh;
}

@Override
public String toString() {
	return "FruitBasket [color=" + color + ", name=" + name + ", weight=" + weight + "]";
}
public String taste()
{
	return "No such taste";
}

}
