package com.arrayspractice.learncoding;

import java.util.Arrays;

public class EqualsMethodsArray {

	public static void main(String[] args) {
		int n1[]= {12,13,14,15,16};
		int n2[]= {12,13,14,15};
		for(int i=0;i<n1.length;i++) {
			System.out.print(n1[i]+ " ");
			
		}
		for(int i=0;i<n2.length;i++) {
			n2[i]=n1[i];
			
			
		}
		boolean b= Arrays.equals(n1, n2);
		System.out.println("\nare they both equal :"+b);

		
		
		

	}

}
