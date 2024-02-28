package assertn;

import java.util.Scanner;

public class Prcts2 {

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		
		String input=s1.next();
		assert input.isEmpty()==false;   //as is empty is giving false when not empty,so condtn is true
		
		int a=input.length();
		System.out.println(a);
	}
}