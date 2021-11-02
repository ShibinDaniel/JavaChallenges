
public class Chall3_mints {

	static void totalMint(int n, int mints) {
		int sum = mints, prev;
		if (n == 1)
			System.out.println("Total mints : " + sum);
		else {
			for (int i = 1; i < n; i++) {
				prev = sum-1;
				sum = prev + sum;
			}
			System.out.println("Total mints : " + sum);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int mint1 = 4;
		totalMint(n, mint1);
	}

}
