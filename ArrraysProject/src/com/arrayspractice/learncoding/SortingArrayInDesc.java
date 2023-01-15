package com.arrayspractice.learncoding;

import java.util.Scanner;

public class SortingArrayInDesc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
	//	int a[] = { 22, 21, 27, 24, 29, 27 };
		int a[]=new int[5];
		
		int temp;
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("before sorting \n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}

			}
		}
		System.out.print("\nafter sorting \n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
