package scannertopic;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter first value");
		int number1=s1.nextInt();
		System.out.println("Please enter second value");
		int number2=s1.nextInt();
		for(int i=number1;i<=number2;i++) {
		System.out.println("Print value: "+i);
		}
	}
}
