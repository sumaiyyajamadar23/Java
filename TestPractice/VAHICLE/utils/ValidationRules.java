package utils;

import java.time.LocalDate;

import com.code.Color;
import com.code.Vehicle;

import CustomExc.VahicleException;
public class ValidationRules 
{
@SuppressWarnings("unlikely-arg-type")
public static void checkDup(String chno,Vehicle []vehicles) throws VahicleException
{
	Vehicle NV=new Vehicle(chno);
	for(Vehicle v:vehicles)
		if(v!=null)
			if(chno.equals(NV))
				throw new VahicleException("Duplicate chasisno");
	System.out.println("No duplicates found");
}
public static LocalDate ParseAndValidate(String date) throws VahicleException
{
	LocalDate d1=LocalDate.parse(date);
	LocalDate begin=LocalDate.of(LocalDate.now().getYear(),1,1);
	if(d1.isAfter(begin))
	  return d1;
	throw new VahicleException("Invalid date");	
}
public static Color ValidateColor(String color)
{
	return Color.valueOf(color.toUpperCase());	
}
//chno,price,vcolor,manufacture,company
public static Vehicle ValidateAll(String chno, double price, String vcolor, 
		String manufacture, String company,Vehicle[]vehicles) throws VahicleException
{
	checkDup(chno, vehicles);
	LocalDate date=ParseAndValidate(manufacture);
	Color col=ValidateColor(vcolor);
	double netprice=price+col.getCost();
	return new Vehicle(chno, netprice, col, date, company);
}
}
