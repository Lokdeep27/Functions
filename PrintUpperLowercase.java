package for1;

public class PrintUpperLowercase {
	public static void main(String[]args) {
		String word="LokDeep";
		String a= word.toUpperCase();
		int upper=0;
		int lower=0;
		
		for (int i=0;i<word.length();i++) {
			if (word.charAt(i)==a.charAt(i)) {
				upper=upper+1;
			}
			else {
				lower=lower+1;
			}
			
			
		}
		System.out.println(upper);
		System.out.println(lower);
	}

}
