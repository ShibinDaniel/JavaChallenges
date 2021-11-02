package com.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String input = sc.next();
		sc.close();
		checkPalindrome(input);
	}

	static void checkPalindrome(String input) {
		int len = input.length();
		boolean check = true;
		for (int i = 0; i < len / 2; i++) {
			int j = len - 1;
			if (input.charAt(i) != input.charAt(j)) {
				check = false;
				System.out.println("Not a palindrome");
				break;
			}
			j--;
		}
		if (check) {
			System.out.println("It is a palindrome");
		}
	}
}
