package strngfnctns;

public class Palindrm {

	public static void main(String[] args) {
		String input ="Anam";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--) {
			char ch1=input.charAt(i);
			output=output+ch1;
			
		}
		System.out.println(output);
		if(input.equalsIgnoreCase(output)) {
			System.out.println("This is a palindrome");
		}
		else {
			System.out.println("This is not a palindrome");
		}
	}

}
