package com.arrayspractice.learncoding;

import java.util.Scanner;

public class ScannerInputArray {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}

	}

}
