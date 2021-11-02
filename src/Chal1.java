import java.util.Scanner;

public class Chal1 {

	public static void getDistance(int n) {
		int x = 0, y = 0;
		int distance = 10;
		char c = 'R';
		while (n > 0) {
			switch (c) {
			case 'R':
				x = x + distance;
				distance += 10;
				System.out.println(c);
				c = 'U';
				break;

			case 'U':
				y = y + distance;
				distance += 10;
				c = 'L';
				break;

			case 'L':
				x = x - distance;
				distance += 10;
				c = 'D';
				break;

			case 'D':
				y = y - distance;
				distance += 10;
				c = 'A';
				break;

			case 'A':
				x = x + distance;
				distance += 10;
				c = 'R';
				break;
			default:
				break;
			}
			n--;
		}
		System.out.println("The distance is " + x + "," + y);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = s.nextInt();
		s.close();
		getDistance(n);
	}

}
