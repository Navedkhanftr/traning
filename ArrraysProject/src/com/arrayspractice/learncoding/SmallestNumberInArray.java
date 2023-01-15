package com.arrayspractice.learncoding;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		int a[] = { 20, 3, 24, 567, 2 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min =a[i];

			}

		}
		System.out.println("minimum number in array :" + min);

	}

}
