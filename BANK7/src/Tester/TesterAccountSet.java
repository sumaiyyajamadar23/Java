package Tester;

import java.util.HashSet;

import com.banking.BankAccount;

import ennum.AccountType;

public class TesterAccountSet 
{

	public static void main(String[] args) 
	{
		BankAccount a1=new BankAccount(101,"RAMA",10000,AccountType.SAVING);
		BankAccount a2=new BankAccount(102,"DHAMA",45000,AccountType.CURRENT);
		BankAccount a3=new BankAccount(103,"SHAMA",25000,AccountType.SAVING);
		BankAccount a4=new BankAccount(101,"RAMA",10000,AccountType.SAVING);
		
		HashSet<BankAccount> Act=new HashSet<BankAccount>();
		System.out.println("Added"+Act.add(a1));//t h1 
		System.out.println("Added"+Act.add(a2));//t h1 e1
		System.out.println("Added"+Act.add(a4));//f h1 e1
		System.out.println("Added"+Act.add(a3));//t h1 e2
		
		System.out.println("Size:"+Act.size());
		for(BankAccount b:Act)
		{
			System.out.println(b);
		}	
		System.out.println(a1.equals(a4));
		System.out.println(a1.hashCode()+"  "+a4.hashCode());
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode()+"  "+a2.hashCode());

	}

}
