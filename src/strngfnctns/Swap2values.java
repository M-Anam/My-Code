package strngfnctns;

import java.util.Scanner;

public class Swap2values {

	static int c=0;
	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of first variable");
		int a=s1.nextInt();
		System.out.println("a="+a);
		System.out.println("Enter value of second variable");
		int b=s1.nextInt();
		System.out.println("b="+b);
		System.out.println("After swappning values");
		c=a;
		a=b;
		System.out.println("a="+a);
		
		b=c;
		System.out.println("b="+b);
				
	}
}
