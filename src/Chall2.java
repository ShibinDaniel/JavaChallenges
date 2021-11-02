import java.util.Scanner;

public class Chall2 {
	static int[] eNo = { 101, 102, 103, 104 };
	static String[] Name = { "Milk", "Sprite", "Yogurt", "Cheese" };
	static int[] Price = { 30, 25, 32, 40 };
	static int[] Quantity = { 20, 9, 12, 14 };
	static int index = -1;
	static int price = 0;

	static public int checkId(int eNum) {
		for (int i = 0; i < eNo.length; i++) {
			if (eNo[i] == eNum)
				index = i;
		}
		if (index == -1)
			return 0;
		else
			return 1;
	}

	static void getStock(int eNum, int quant) {
		if (checkId(eNum) == 0)
			System.out.println("Element does not exist");
		else {
			if (Quantity[index] >= quant) {
				Quantity[index] = Quantity[index] - quant;
				price = Price[index] * quant;
				System.out.println("Total Cost : Rs" + price);
				System.out.println("Current stock : " + Quantity[index]);
			} else {
				System.out.println("Insuffucient stock");
				System.out.println("Current stock : " + Quantity[index]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element No. : ");
		int eNum = sc.nextInt();
		System.out.print("Enter the quantity : ");
		int quant = sc.nextInt();
		sc.close();
		System.out.println("Result");
		getStock(eNum, quant);
	}
}