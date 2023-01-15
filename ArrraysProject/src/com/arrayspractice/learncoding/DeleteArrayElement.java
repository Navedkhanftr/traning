package com.arrayspractice.learncoding;

import java.util.Scanner;

public class DeleteArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements ");
		int size, loc;
		size = sc.nextInt();

		int a[] = { size };
		System.out.println("before deleting array elements \n");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");

		}
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter array elements ");
		loc=sc.nextInt();
		for(int i=loc;i<size-1;i++) {
			a[i]=a[i+1];
			
			
		}
		size--;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		
		
	}
}