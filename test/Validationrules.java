package Validate;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import CustomE.CustomExc;
import comcode.Dept;
import comcode.Empc;

public class Validationrules 
{
public static void checkduplicates(String id,Map<String,Empc> emp) throws CustomExc
{
if(emp.containsKey(id))
	throw new CustomExc("Duplicate!!!!!!!!!!");
System.out.println("Not duplicate!!!!");
}
public static Dept valueofDept(String dept)
{
	Dept dep=Dept.valueOf(dept.toUpperCase());
	return dep;
}
public static LocalDate parseDate(String date) throws CustomExc
{
	LocalDate d1=LocalDate.parse(date);
	LocalDate begin=LocalDate.now();
	int years=Period.between(d1, begin).getYears();
	if(years>3)
	  throw new CustomExc("Not valid date");
	return d1;
	
}
public static Empc validateAll(String id, String name, String joindate, String department,Map<String,Empc>emp) throws CustomExc
{
	checkduplicates(id, emp);
	LocalDate vdate=parseDate(joindate);
	Dept department1=valueofDept(department);
	return new Empc(id,name,vdate,department1);
}
}
