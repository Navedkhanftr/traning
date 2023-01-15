package com.arrayspractice.learncoding;

public class SwappingNumberArrray {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55,66,77,88,99,111};
		//expected answer in array 22,11,44,33,66,55,88,77,111,99
		for(int i=0;i<a.length;i=i+2) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			//a[j]=temp;
			//System.out.println(j[i]);
			//System.out.print(a[i]+ " ");
		}
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+ " ");
		}

		
		} 

	}


