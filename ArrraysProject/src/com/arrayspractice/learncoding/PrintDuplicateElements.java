package com.arrayspractice.learncoding;

public class PrintDuplicateElements {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 6, 4, 5, 6, 2, 7, 8, 9, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);

				}

			}
		}

	}

}
