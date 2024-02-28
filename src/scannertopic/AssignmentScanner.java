package scannertopic;

import java.util.Scanner;

public class AssignmentScanner {

	void addition() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter first value");
		int a=s1.nextInt();
		System.out.println("Please enter second value");
		int b=s1.nextInt();
		int c=a+b;
		System.out.println("Addition is: "+c);
	}
	void substraction() {
		Scanner s2=new Scanner(System.in);
		System.out.println("Please enter first value");
		int a=s2.nextInt();
		System.out.println("Please enter second value");
		int b=s2.nextInt();
		int c=a-b;
		System.out.println("Substraction is: "+c);
	}
	void multiplication() {
		Scanner s3=new Scanner(System.in);
		System.out.println("Please enter first value");
		int a=s3.nextInt();
		System.out.println("Please enter second value");
		int b=s3.nextInt();
		int c=a*b;
		System.out.println("Multiplication is: "+c);
	}
	void division() {
		Scanner s4=new Scanner(System.in);
		System.out.println("Please enter first value");
		int a=s4.nextInt();
		System.out.println("Please enter second value");
		int b=s4.nextInt();
		int c=a/b;
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
