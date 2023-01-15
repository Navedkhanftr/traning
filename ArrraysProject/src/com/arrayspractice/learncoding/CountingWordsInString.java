package com.arrayspractice.learncoding;

public class CountingWordsInString {

	public static void main(String[] args) {
		String name = "palle is famous web devloper institute";
		int count = 1;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				count++;
				// System.out.println(count);
			}

		}
		System.out.println("total count ="+count);
	}

}
