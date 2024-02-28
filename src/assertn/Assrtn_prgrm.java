package assertn;

import java.util.Scanner;

public class Assrtn_prgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		
		int input=s1.nextInt();
		assert input>10;      //assert input>10:"Your message" -->2nd syntax
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println(sum);
	}

}
