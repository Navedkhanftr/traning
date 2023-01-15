package com.arrayspractice.learncoding;

import java.util.Scanner;

public class FindArrayLength {

	public static void main(String[] args) {
		int a[]= {12,23,45,56,67};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			System.out.println(+a[i]);
			
		}
		System.out.println("lenth of array ="+a.length);
		

	}

}
