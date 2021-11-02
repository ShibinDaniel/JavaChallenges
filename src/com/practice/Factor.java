package com.practice;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		int power = 3;
		// getFactor(num);
		getPower(num, power);
	}

	static void getFactor(int n) {
		int factor = 1;
		for (int i = n; i >= 1; i--) {
			factor = factor * i;
		}
		System.out.println("The factor of " + n + " is " + factor);
	}

	static void getPower(int base, int power) {
		long result = 1;
		for (; power != 0; --power) {
			result = result * base;
		}
		System.out.println("The result of " + base + "^" + power + " is " + result);
	}
}
