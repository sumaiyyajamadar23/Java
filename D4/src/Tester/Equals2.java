package Tester;

import java.time.LocalDate;

import com.code.Vahicle;
import com.code.color;

public class Equals2 {

	public static void main(String[] args)
	{
		String s="hello";
		// String chasisNo, Color vehicleColor, double netPrice, LocalDate
		// manufactureDate, String company) {
		Object v1 = new Vahicle("abc-12345", color.BLACK, LocalDate.parse("2023-02-03"), "Honda");
		Object v2 = new Vahicle("abc-12345", color.RED, LocalDate.parse("2023-02-03"), "Honda");
		
		System.out.println(v1.equals(v2));// t : replace ref equality by Unique ID (PK) equality : ch no
		System.out.println(v1.equals(s));//f no javac err : up casting
	

	}

}
