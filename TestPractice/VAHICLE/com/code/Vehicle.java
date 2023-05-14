package com.code;

import java.time.LocalDate;

public class Vehicle 
{
private String chno;
private double price;
private Color vcolor;
private LocalDate manufacture;
private String company;

public Vehicle(String chno, double price, Color vcolor, LocalDate manufacture, String company) {
	super();
	this.chno = chno;
	this.price = price;
	this.vcolor = vcolor;
	this.manufacture = manufacture;
	this.company = company;
}


public Vehicle(String chno) {
	super();
	this.chno = chno;
}


public String getChno() {
	return chno;
}
public double getPrice() {
	return price;
}
public Color getVcolor() {
	return vcolor;
}
public LocalDate getManufacture() {
	return manufacture;
}
public String getCompany() {
	return company;
}

@Override
public boolean equals(Object obj) 
{
	if(obj instanceof Vehicle)
			return this.chno.contains (((Vehicle)obj).chno);
	return false;
}


@Override
public String toString() {
	return "Vehicle [chno=" + chno + ", price=" + price + ", vcolor=" + vcolor + ", manufacture=" + manufacture
			+ ", company=" + company + "]";
}

}
