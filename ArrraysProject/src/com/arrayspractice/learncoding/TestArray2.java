package com.arrayspractice.learncoding;

public class TestArray2 {

	public static void main(String[] args) {
		int arr[] = { 23, 4, 5 };
		// for(int i:arr) {
		// System.out.println(i);
		//
		// }
		int small = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
				System.out.println(arr[i]);
			}

		}
	}

}
