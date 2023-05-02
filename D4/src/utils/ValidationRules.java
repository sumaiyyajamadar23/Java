package utils;

import java.time.LocalDate;


import com.code.Vahicle;
import com.code.color;

import customException.VahicleException;

public class ValidationRules 
{
public static void checkDuplicates(String newchno,Vahicle []vahicles) throws VahicleException
{
	@SuppressWarnings("unused")
	Vahicle newVahicle=new Vahicle(newchno, null, null, newchno);
	for(Vahicle v: vahicles)
	{
		if(v!=null)
			if(v.equals(newchno))
				throw new VahicleException("Duplicateeee!!!!!!!");
		System.out.println("Not Duplicate.....");
	}
}
public static LocalDate Parsedate(String date) throws VahicleException
{
	LocalDate d1=LocalDate.parse(date);
	LocalDate begining=LocalDate.of(LocalDate.now().getYear(), 1, 1);
	if(d1.isAfter(begining))
		throw new VahicleException("Manufacture after 1st jan of this year");
	return d1;	
}
public static color parseAndValidateColor(String clr) 
{
	return color.valueOf(clr.toUpperCase());
}
public static Vahicle validateAll(String newchno,String clr,double basePrice,
			String manufactureDate, String company, Vahicle[] vehicles) throws VahicleException
{
	checkDuplicates(newchno, vehicles);
	color validColor = parseAndValidateColor(clr);
	double netPrice = basePrice + validColor.getCost();
	LocalDate validDate = Parsedate(manufactureDate);
	return new Vahicle(newchno, clr, netPrice, validDate, company);
	
	
}
}
