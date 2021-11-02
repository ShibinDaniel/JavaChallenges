package com.practice;

import java.util.Scanner;

public class String_chal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = sc.nextLine();
		sc.close();
		getWordSum(input);
	}
	
	public static void getWordSum(String word) {
		int n,sum=0 ;
		Character s;
		for(int i = 0 ; i<word.length();i++) {
			s = word.charAt(i);
			n = word.charAt(i);
			if(Character.isWhitespace(s) || !Character.isAlphabetic(s)) {
				continue;
			}
			sum += n;
			System.out.println(s+" "+n);
			System.out.println("sum "+sum);
		}
		System.out.println("The sum of the letters is "+sum);
	}

}
