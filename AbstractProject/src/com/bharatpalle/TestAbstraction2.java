package com.bharatpalle;

public class TestAbstraction2 {

	public static void main(String[] args) {
		Bank b;
		b=new Pnb();
		int n1=b.getRateOfInterest();
		System.out.println("rate of ineterest is "+n1);
		b=new Sbi();
		int n2=b.getRateOfInterest();

		System.out.println("rate of interest is "+n2);
		

	}

}
abstract class Bank{
	abstract int getRateOfInterest();
	
}
class Sbi extends Bank{

	@Override 
	int getRateOfInterest() { 
		return 10;
	}
	
}
class Pnb extends Bank{

	@Override
	int getRateOfInterest() { 
		return 12;
	}
	
}
