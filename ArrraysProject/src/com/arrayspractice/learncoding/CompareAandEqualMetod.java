package com.arrayspractice.learncoding;

import java.util.Arrays;

public class CompareAandEqualMetod {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 10, 20, 30, 40, 50 };
		if (Arrays.equals(a, b)) {
			System.out.println("both are equal ");

		} else {
			System.out.println("both are not equal ");
		}

	}

}
