package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String input = sc.nextLine();
		reverseSent(input);
		sc.close();
	}
	
	static void reverseSent(String in) {
	String result = "";
	String[] words = in.split(" ");
	for(int i=words.length-1;i>=0;i--) {
		result = result+words[i]+" ";
	}
	System.out.println(result);
	}
	
	//using recursion 
	static void usingRecursion(String in) {
		String result ="";
		String[] words = in.split(" ");
		int n = words.length-1;
		if(n<0)
			System.out.println(result);
		result = result+words[n];
		//result += usingRecursion(result);
		System.out.println(result+" ");
	}
}
