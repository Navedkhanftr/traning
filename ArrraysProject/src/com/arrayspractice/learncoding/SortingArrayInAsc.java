package com.arrayspractice.learncoding;

public class SortingArrayInAsc {

	public static void main(String[] args) {
     int a[]= {12,10,17,15,11};
     int temp;
     System.out.print("array element before sorting \n");
     for(int i=0;i<a.length;i++) {
    	 System.out.print(a[i]+" ");
    	 
     }
     for(int i=0;i<a.length;i++) {
    	 for(int j=i+1;j<a.length;j++) {
    		 if(a[i]>a[j]) {
    			 temp=a[i];
    			 a[i]=a[j];
    			 a[j]=temp;
    			 
    			 
    		 }
    		 
    	 }
     }
     System.out.println("\nafter sorting elements \n");
     for(int i=0;i<a.length;i++) {
    	 System.out.print(a[i]+" ");
    	 
     
     }
	}

}
