package com.practice.patterns;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "*";
		int n = 6;
		for(int i=0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(i>0) {
					for(int z = 0; z<n-i-1;z++) {
						System.out.print(" ");
						j=n;
					}
				}
				System.out.print(s);
			}
			System.out.println();
		}
	}

}
