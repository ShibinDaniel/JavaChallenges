
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i; int n[] = {1,3,5,7};
		 * 
		 * System.out.println("The contents of the array are : ");
		 * for(i=0;i<n.length;i++) { System.out.println(n[i]); } int j = n.length - 1;
		 * System.out.println("The contents of the array in reverse are : ");
		 * for(i=0;i<n.length;i++) { int temp = n[j]; j--; System.out.println(temp); }
		 */
			int n[] = {1,3,5,7};
			System.out.println("The contents of the array are : ");
			for(int i=0;i<n.length;i++) { 
				System.out.println(n[i]);
				}
			System.out.println("The contents of the array in reverse are : ");
			for(int j = n.length - 1;j>=0;j--) {
				System.out.println(n[j]);
			}
	}

}
