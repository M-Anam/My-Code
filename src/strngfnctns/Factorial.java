package strngfnctns;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any no.");
		int a=s1.nextInt();
		System.out.println("a="+a);
		int fact=1;
		
		for(int i=a;i>1;i--) {
			
			fact=fact*i;
			}
		System.out.println("The factorial of entered number is:->"+fact);
		}
}
