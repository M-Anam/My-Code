package scannertopic;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);

		String name=s1.next();
		Byte smallerinput=s1.nextByte();
		short s2=s1.nextShort();
		int s3=s1.nextInt();
		long s4=s1.nextLong();
		float s5=s1.nextFloat();
		double s6=s1.nextDouble();
		boolean s7=s1.nextBoolean();
	}

}
