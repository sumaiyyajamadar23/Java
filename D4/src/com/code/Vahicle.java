package com.code;

import java.time.LocalDate;

//import com.app.core.Vehicle;

public class Vahicle
{
private String chasisno;
private color vahicleColor;
private LocalDate manufactureDate;
private String company;
private boolean isAvailable;

public Vahicle( String chasisno,color vahicleColor,
		LocalDate manufactureDate,String company)
{
	this.chasisno=chasisno;
	this.vahicleColor=vahicleColor;
	 this.manufactureDate=manufactureDate;
	 this.company=company;
	 this.isAvailable=isAvailable;
}
public  Vahicle(String chasisno, String clr, double netPrice, LocalDate validDate, String company2) 
{
this.chasisno=chasisno;	
}
@Override
public String toString() {
	return "Vahicle [chasisno=" + chasisno + ", vahicleColor=" + vahicleColor + ", manufactureDate=" + manufactureDate
			+ ", company=" + company + ", isAvailable=" + isAvailable + "]";
}
@Override
public boolean equals(Object o) {
	System.out.println("in vehicle equals");
	if (o instanceof Vahicle)
		return this.chasisno.equals(((Vahicle) o).chasisno);
	return false;
}
}
