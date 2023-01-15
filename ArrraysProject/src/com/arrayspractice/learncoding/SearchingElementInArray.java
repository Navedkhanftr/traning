package com.arrayspractice.learncoding;

public class SearchingElementInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 23, 32, 42 };
		int element=32;
		int pos=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				pos=i;
				break;
				
			}
			
			
		}
		if(pos==-1) {
			System.out.println(" not found the element ");
		}else {
			System.out.println("element  found ="+element);
		}
	}

}
