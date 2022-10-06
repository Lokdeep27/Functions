package for1;

public class PrintingReverseString {
	public static void main(String[]args) {
		
		String value="trainer";
		String template="";
		
		for (int i=value.length()-1;i>0;i--) {
			template=template+value.charAt(i);
		}
		System.out.println(template);
		
		}
	}

