import static java.time.LocalDate.now;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class T3 
{
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter DoB : yyyy-MM-dd");
			LocalDate dob = parse(sc.next());
			int age=Period.between(dob, now()).getYears();
			System.out.println("Age "+age);

		} // sc.close();
	}
}
