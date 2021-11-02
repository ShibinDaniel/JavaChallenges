package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number :");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println("The GCD of "+num1+" and "+num2+" using recursion is "+getGCD(num1, num2));
		System.out.println("\n");
		//System.out.println("The GCD of "+num1+" and "+num2+" using normal logic is "+getGCD(num1, num2));
		System.out.println(getGCD(num1, num2));
	}

	static int getGCD(int num1, int num2) {
		if(num2 == 0)
			return num1;
		return getGCD(num2, num1%num2);
	}
	
	static List<Integer> method2(int num1, int num2) {
		List<Integer> divisorList = new ArrayList<Integer>();
		int divisor = 1;
		while(num1/divisor > 0 || num2/divisor >0) {
			if(num1%divisor == 0 && num2%divisor == 0)
				divisorList.add(divisor);
			divisor++;
		}
		for (Integer div : divisorList) {
			System.out.println(div);
		}
		divisorList.forEach(div-> System.out.println(div));
		 System.out.println(divisorList.get(divisorList.size()-1));
		 return divisorList;
	}
}
