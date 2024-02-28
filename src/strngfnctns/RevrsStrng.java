package strngfnctns;

public class RevrsStrng {

	public static void main(String[] args) {
		
		String input ="Virat";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--) {
			char ch1=input.charAt(i);
			output=output+ch1;
			
		}
		System.out.println(output);

	}
}
