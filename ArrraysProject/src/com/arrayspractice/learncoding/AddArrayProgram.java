package com.arrayspractice.learncoding;

public class AddArrayProgram {

	public static void main(String[] args) {
     int a1[]= {11,12,13,14,15};
     int sum=0;
     for(int i=0;i<a1.length;i++) {
    	 System.out.print(a1[i]+" ");
    	 
     }for(int i=0;i<a1.length;i++) {
    	 sum=a1[i]+sum;
    	 
     }
     System.out.print("add of array elements ="+sum);
	}

}
