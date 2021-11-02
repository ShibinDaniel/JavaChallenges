package com.practice;

public class ConstStatic {
	
	ConstStatic() {
		System.out.println("This is constructor");
	}
	
	public void trial() {
		System.out.println("this is a method");
	}
	
	
	static {
		System.out.println("This is static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstStatic cs = new ConstStatic();
		cs.trial();
		
	}

}
