package strngfnctns;

import java.util.Scanner;

public class SwapWO3rd {

	public static void main(String[] args) {

		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of first variable");
		int a=s1.nextInt();
		System.out.println("a="+a);
		System.out.println("Enter value of second variable");
		int b=s1.nextInt();
		System.out.println("b="+b);
		System.out.println("After swappning values");
		
		a=a+b;
		//a=a-b; not able to swap if we try fr a frst
		b=a-b;  
		a=a-b;
		System.out.println("a="+a);	
		System.out.println("b="+b);
	}
}
