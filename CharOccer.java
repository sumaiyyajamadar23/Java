import java.util.Scanner;

public class CharOccer {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	String str="Hi everyone how are you";
	char c=sc.next().charAt(0);
	int arr[]=new int[100];
	int count=0;
	int index=0;
	
	if(str.contains("o"))
	{
		for(int i=0;i<str.length();i++)
		{
			
			if(c==str.charAt(i))
			{
				count=i;
				System.out.println("Character " +c+" presents at"+count+" position");
				arr[index]=i;
				index++;
			}
			count++;
		}
		if(count==1) 
		{
			System.out.println("ocuures onlly once:");
		}
		else
		{
			//count--;
			//System.out.println("Character " +c+" presents at"+count+" position");
			System.out.println(arr[index-2]);
		}
		}
	else
	{
		System.out.println("not present");
	}

	}

}
