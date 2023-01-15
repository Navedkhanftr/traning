package com.arrayspractice.learncoding;

import java.util.Arrays;

public class SortingAraay {
	public static void main(String[] args) {
		int a[]= {36,24,54,23,35};
		System.out.println("before sorting \n");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
			
		}
		Arrays.sort(a);
		System.out.println("\nafter sorting \n");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
			
		}
	}

}
