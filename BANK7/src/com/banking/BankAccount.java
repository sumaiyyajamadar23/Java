//One bucket use only
package com.banking;

import ennum.AccountType;

public class BankAccount 
{
private int accno;
private String custName;
private double balance;
private AccountType type;

public BankAccount(int accno, String custName, double balance, AccountType type) {
	super();
	this.accno = accno;
	this.custName = custName;
	this.balance = balance;
	this.type = type;
}

public BankAccount(int accno)
{
	this.accno=accno;
}

@Override
public String toString() {
	return "BankAccount [accno=" + accno + ", custName=" + custName + ", balance=" + balance + ", type=" + type + "]";
}
@Override
public boolean equals(Object o)
{
	System.out.println("In bank's equal!!");
	if(o instanceof BankAccount)
		return this.accno==((BankAccount)o).accno;
	return false;
}

@Override
public int hashCode() 
{
	System.out.println("in bank's hashcode!!");
	return this.accno;
}


}
