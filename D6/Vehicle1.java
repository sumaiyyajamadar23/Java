package com.code;

import java.time.LocalDate;

public class Vehicle1 
{
private String chno;
public double price;
private LocalDate manufacture;
private Color vcolor;
private String company;
public Vehicle1(String chno, double price, LocalDate manufacture, Color vcolor, String company) {
	super();
	this.chno = chno;
	this.price = price;
	this.manufacture = manufacture;
	this.vcolor = vcolor;
	this.company = company;
}
public Vehicle1(String chno)
{
	this.chno=chno;
}
@Override
public String toString() {
	return "Vehicle1 [chno=" + chno + ", price=" + price + ", manufacture=" + manufacture + ", vcolor=" + vcolor
			+ ", company=" + company + "]";
}
//@Override
//public boolean equals(Object o)
//{
//	System.out.println("In vehicles equals method");
//		if(o  instanceof Vehicle1)
//			return this.chno.equals(((Vehicle1)o).newchno);
//}
}
