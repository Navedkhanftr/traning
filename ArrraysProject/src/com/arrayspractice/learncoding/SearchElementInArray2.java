package com.arrayspractice.learncoding;

import java.util.Scanner;

public class SearchElementInArray2 {

	public static void main(String[] args) {

		int n = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		System.out.println("search array elements");
		for (int i = 0; i < arr.length; i++) {
			n=sc.nextInt();

			if (arr[i] == n) {
				count++;

			}
			if (count > 0) {
				System.out.println("item found  =");
			} else {
				System.out.println("item not found ");
			}
		}
		

	}

}
