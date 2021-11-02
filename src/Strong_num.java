//A strong number is if the factorial of all the digits in the number adds up to the number itself

public class Strong_num {

	static public int factorial(int f) {
		int fact = 1;
		for (int i = 1; i <= f; i++)
			fact = fact * i;
		return fact;
	}

	static void checkStrong(int n) {
		int rem, sum = 0;
		int temp = n;
		System.out.println("Got into the func");
		while (temp != 0) {
			rem = temp % 10;
			int fact1 = factorial(rem);
			sum = sum + fact1;
			temp = temp / 10;
		}
		if(sum == n)
			System.out.println(sum+" is a strong number");
		else
			System.out.println(n+ " is not a strong number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 145;
		System.out.println("Working");
		checkStrong(input);
	}

}
