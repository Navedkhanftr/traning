package com.arrayspractice.learncoding;

public class PallindromeStringReverse {

	public static void main(String[] args) {
		String p="liril";
		String reverse="";
		for(int i=p.length()-1;i>=0;i--) {
			reverse =reverse+p.charAt(i);
			
			
		}
		System.out.println(reverse);
		if(p.equals(reverse)) 
		{
			System.out.println("this is palindrome string "+p);
		}
		else {
			System.out.println("this is not palindrome string ");
		}

	}

}
