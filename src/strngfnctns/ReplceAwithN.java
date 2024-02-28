package strngfnctns;

public class ReplceAwithN {

	public static void main(String[] args) {
		String input ="abhishek";
		String output=input.replace('a', 'n');
		System.out.println(output);
		
		String output1=input.replaceAll("h"," ");
		System.out.println(output1);

		String name="Anam Mukadam";
		String output2=name.replaceAll("Mukadam","Kohli");
		System.out.println(output2);
		
		String output3=name.replaceAll("[a-z]", "");
		System.out.println(output3);
		
		String output4=name.replaceAll("[A-Z]", "");
		System.out.println(output4);
	}
}
