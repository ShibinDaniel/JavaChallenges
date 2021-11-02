package com.practice;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "eye eye";
		System.out.println(recursiveSent(s));
		System.out.println("The above text is a plaindrome - "+isPalindrome(s)+"!!");
	}

	static int recursive(int n) {
		if (n == 0)
			return 0;
		n--;
		int r = n * n;
		return r + recursive(n);
	}

	static String recursiveSent(String str) {

		String[] words = str.split(" ");
		String reversedString = "";

		for (int i = words.length - 1; i >= 0; i--) {

			reversedString = reversedString + words[i] + " ";
		}

		return reversedString;
	}
	
	static boolean isPalindrome(String text) {
	    String str = recursive(text);
	    if(str.equals(text))
	    	return true;
	    else
	    	return false;
	}
	
	static int n = 1;
 
	static String recursive(String s) { // John
		// Character f= 1;
		if (s.length() - n < 0)
			return "";
		char r = s.charAt(s.length() - n);
		n++;
		return r + recursive(s);
	}

}

//16 +    3  = n   m = 1
//9  +    2  = h       2
//4  +    1  = o       3
//1  +    0            4  