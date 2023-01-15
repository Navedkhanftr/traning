package com.arrayspractice.learncoding;

public class TestArray1 {

	public static void main(String[] args) {
		int a[] = { 10, 33, 4, 5 };
		int big = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > big) {
				big = a[i];
				System.out.println(a[i]);

			}

		}

	}

}
