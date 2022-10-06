package for1;

public class Palandrome {
	public static void main(String[]args) {
		String a="malayalam";
		String temp ="";
		
		for (int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
		}
		if (a.equals(temp)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
