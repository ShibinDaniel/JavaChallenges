

public class BubbleMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 2, 7, 12, 23, 17, 15, 11, 12, 1, 5 };
		int n = a.length;
		System.out.println(n);
		int t;
		 System.out.println("This is the Og pattern");
		 for(int i=0;i<n;i++) {
			 System.out.print(a[i]+" ");
		 }
		 System.out.println("\nThe pattern after sorting is ");
		 for(int i=0;i<n;i++) {
			 int flag = 0;
			 for(int j=0 ; j < n-1-i; j++){  
                 if(a[j] > a[j+1]){  
                        //swap elements  
                        t = a[j];  
                        a[j] = a[j+1];  
                        a[j+1] = t;
                        flag = 1;
                }  	              
			 }
			 if(flag==0){
             	break;
              }			
		 }
		 for(int i=0;i<n;i++) {
			 System.out.print(a[i]+" ");
		 }
		 
	}
}