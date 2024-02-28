package scannertopic;

import java.util.Scanner;


public class Assignment2 {

	float c;
	float a;
	float b;
	Scanner s1=new Scanner(System.in);
	void addition() {
		System.out.println("Please enter first value");
		a=s1.nextFloat();
		System.out.println("Please enter second value");
		b=s1.nextFloat();
		c=a+b;
		System.out.println("Addition is: "+c);
	}
	void substraction() {
		
		System.out.println("Please enter first value");
		a=s1.nextFloat();
		System.out.println("Please enter second value");
		b=s1.nextFloat();
		c=a-b;
		System.out.println("Substraction is: "+c);
	}
	void multiplication() {
		
		System.out.println("Please enter first value");
		a=s1.nextFloat();
		System.out.println("Please enter second value");
		b=s1.nextFloat();
		c=a*b;
		System.out.println("Multiplication is: "+c);
	}
	void division() {
		
		System.out.println("Please enter first value");
		a=s1.nextFloat();
		System.out.println("Please enter second value");
		b=s1.nextFloat();
		c=a/b;
		System.out.println("Division is: "+c);
	}
	public static void main(String[] args) {
		AssignmentScanner a1= new AssignmentScanner();
		a1.addition();
		a1.substraction();
		a1.multiplication();
		a1.division();
	}
}