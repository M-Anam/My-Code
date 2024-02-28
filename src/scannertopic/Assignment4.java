package scannertopic;

import java.util.Scanner;

public class Assignment4 {

	static double a;
	
	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the value of r");
		float r=s1.nextFloat();
		
		a= 3.14*r*r;
		System.out.println("Area of circle is: "+a);
	}
}