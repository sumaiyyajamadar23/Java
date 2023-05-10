package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.app.core.Dept;
import com.app.core.Emp;

import exception.CustomException;

public class ValidationRules
{
public static LocalDate parseAndValidateDate(String joiningDate) throws CustomException
{
	LocalDate j_date= LocalDate.parse(joiningDate);
	int a=Period.between(j_date, LocalDate.now()).getYears();
	if(a>3)
		throw new CustomException("not validate date");
	return j_date;
}
public static Dept parseAndValidateDept(String dept)
{
    Dept dept1=Dept.valueOf(dept.toUpperCase());
	return dept1;
}
public static String checkForDuplicate(String id,Map<String,Emp> empMap) throws CustomException
{
	if(empMap.containsKey(id))
		throw new CustomException("Duplicate employee id");	
	return id;	
}
public static Emp ValidateAll(String id, String firstName, String lastName, String dept,
		String joiningDate,Map<String, Emp>mp) throws CustomException
{
	checkForDuplicate(id, mp);
	Dept dept1= parseAndValidateDept(dept);
	LocalDate date=parseAndValidateDate(joiningDate);
	return new Emp(id, firstName, lastName, dept1, date);
}
 

	
}
