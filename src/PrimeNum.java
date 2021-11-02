import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		if (n == 1) {
			System.out.println("This is definitely not a prime number");
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0)
					flag = 1;
			}
			if (flag == 1)
				System.out.println("This is not a prime number");
			else
				System.out.println("This is a prime number");
		}
	}

}
