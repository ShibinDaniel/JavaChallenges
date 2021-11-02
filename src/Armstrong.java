

import java.util.Scanner;

public class Armstrong {

	public Boolean isArmstrong(int n) {
		int temp, r = 0, sum = 0;
		String l = String.valueOf(n);
		System.out.println(l.length());
		temp = n;
		while (n > 0) {
			int re = 1;
			r = n % 10;
			n = n / 10;
			for (int i = 0; i < l.length(); i++)
				re = re * r;
			sum = sum + re;
		}
		if (sum == temp)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Armstrong a = new Armstrong();
		System.out.println("Enter the number");
		int n = s.nextInt();
		s.close();
		if (a.isArmstrong(n))
			System.out.println("It is an armstrong number");
		else
			System.out.println("It is not an armstrong number");
	}
}
