package for1;

public class FIndPrimeNumber1 {
public static void main(String[]args) {
		
		int num=7;
		int a =0;
		
		for (int i=2;i<num;i++) {
			if (num%i==0) {
				a=1;
			}
		}
			if (a==0) {
				System.out.println("Prime Number");
				
			}
			else {
				System.out.println("Not Prime Number");
				
			}
		}
	

}
