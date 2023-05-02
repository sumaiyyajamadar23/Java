package Tester;

import java.time.LocalDate;
import com.code.Vahicle;
import com.code.color;

public class Equals1 {

	public static void main(String[] args) 
	{
		// String chasisNo, Color vehicleColor, double netPrice, LocalDate
		// manufactureDate, String company) {
		Vahicle v1 = new Vahicle("abc-12345", color.BLACK, LocalDate.parse("2023-02-03"), "Honda");
		Vahicle v2 = new Vahicle("abc-12345", color.RED, LocalDate.parse("2023-02-03"), "Honda");
		System.out.println(v1==v2);//f
		System.out.println(v1.equals(v2));//f : ref equality -- t : replace ref equality by Unique ID (PK) equality : ch no
		System.out.println(v1.hashCode()+" "+v2.hashCode());//different	
	}
}
