package com.arrayspractice.learncoding;

public class AverageOfArray {

	public static void main(String[] args) {
    int a[]= {10,20,30,40,50};
    int sum=0;
    double avg;
    System.out.println("array elements");
    for(int i=0;i<a.length;i++) {
    	System.out.print(a[i]+ " ");
    	
    }
    for(int i=0;i<a.length;i++) {
    	sum=a[i]+sum;
    }
    avg=sum/a.length;
    System.out.println("\naverage of array= "+avg);
    
	}

}
