package com.practice;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		checkPrime(n);
	}

	static boolean checkPrime(int num) {
		int flag = 0;
		if (num == 0 || num == 1 || num % 2 == 0) {
			System.out.println("Not prime");
			return false;
		} 
					
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println("Not a Palindrome");
				return false;
			}
		}
		/*
		 * if (flag == 0) { System.out.println("It is a Palindrome"); return true; }
		 */
		System.out.println("It is a Palindrome");
		return true;
	}

}
