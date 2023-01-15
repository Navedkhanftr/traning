package com.arrayspractice.learncoding;

public class FindBiggestElementInArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 50, 60, 30 };
		int max = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}

		}
		System.out.println("biggest number in array  :" + max);
	}

}
