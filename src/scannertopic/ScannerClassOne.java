package scannertopic;

import java.util.Scanner;

public class ScannerClassOne {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter first value");
		int number1=s1.nextInt();
		System.out.println("Please enter second value");
		int number2=s1.nextInt();
		int sum= number1+number2;
		System.out.println("Sum of numbers is: "+sum);
	}

}
