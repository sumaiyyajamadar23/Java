package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static utils.StudentCollectionUtils.*;
import com.app.core.Student;
import com.app.core.Subject;

public class TestStudent {
	//Display all student details from a student list
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			//1. Display all student details from a student list

		List<Student> lists=populateList();
		System.out.println("Students: ");
		lists.forEach(s->System.out.println(s));
		//2.Display all student details from a student map
		System.out.println("MAPPPPPPPP!!!!!!!!!!!!!");
       Map<String, Student> map1=populateMap(lists);
       map1.values().forEach(m ->System.out.println(m));
       //3.Display all student details(list) sorted as per GPA  Use custom orderin
       System.out.println("Sortinggg as per gpaaaaaaaaaaaa");
       lists.stream()
        .sorted((p1, p2) -> ((Double)p1.getGpa()).compareTo(p2.getGpa()))
    	 .forEach(s->System.out.println(s)); 
      //4.Write a tester to print average of  gpa of students (map)for the specified subject eg : i/p : subject	   
	Subject sub=Subject.valueOf(sc.next());
     OptionalDouble std= map1.values()
	.stream()
	.filter(s1->s1.getSubject().equals(sub))
	.mapToDouble(s1->s1.getGpa()) 
	.average();
      if(std.isPresent())
	   System.out.println(std);
      else
	  System.out.println("Wrongggg!!!")
  //5 Print name of specified subject  topper
  //lists.stream()
     Optional<Student> std1= lists.stream()
      .filter(s->s.getSubject().equals(sub))
      .max((p1, p2) -> ((Double) p1.getGpa()).compareTo(p2.getGpa()));
     // System.out.println(std1.get().getName());
  if (std1.isPresent())
	  System.out.println( std1.get().getName()+" Is topper of Subject:"+std1.get().getSubject());
	  else
	System.out.println("wrongggg!!!!!");

		}
       
       
		}
		
	}	
