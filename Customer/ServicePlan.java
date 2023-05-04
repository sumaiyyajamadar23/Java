package com.day5;

public enum ServicePlan {
SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
//state
	private double plancost;
ServicePlan(double plancost ) {
	//super(name,ordinal)
	this.plancost=plancost;
}
//getter
public double getPlancost() {
	return plancost;
}//toString:optional
@Override
public String toString() {
	
	return name()+"cost"+this.plancost;
}


	
	
	
	
	
}
