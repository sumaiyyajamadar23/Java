package utils;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import com.app.*;
import java.util.Map;

import static utils.ValidationRules.*;
import static java.time.LocalDate.parse;
import com.app.core.Dept;
import com.app.core.Emp;


public class EmpUtils 
{
	
	public static Map<String,Emp> populateCustomMap()
{
		Map<String,Emp> empMap=new HashMap<>();

	empMap.put("A101", new Emp("A101","Sumaiyya", "Jamadar",Dept.HR,parse("2021-04-23")));
	empMap.put("A101", new Emp("A102","Priti", "Mundhe",Dept.FINANCE,parse("2022-11-17")));
	empMap.put("A101", new Emp("A103","Sumaiyya", "Jamadar",Dept.HR,parse("2020-04-23")));
	empMap.put("A101", new Emp("A104","Sumaiyya", "Jamadar",Dept.HR,parse("2022-05-04")));
	empMap.put("A101", new Emp("A105","Sumaiyya", "Jamadar",Dept.HR,parse("2021-09-02")));
	return empMap;
}
}

