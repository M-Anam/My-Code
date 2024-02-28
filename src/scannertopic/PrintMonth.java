package scannertopic;

import java.util.Scanner;

public class PrintMonth {

static Scanner s1=new Scanner(System.in);
static int b;
static int a;
	public static void main(String[] args) {		
		System.out.println("Enter any year");
		b=s1.nextInt();
		if(b%4!=0) {
			System.out.println("Enter any day");
			a=s1.nextInt();
			
		
		if (a<=31 ) {
			System.out.println("January");
		}
		else if (a>31 && a<=59) {
				System.out.println("Feb");
			}
		else	if (a>59 && a<=90) {
				System.out.println("March");
			}
		else if (a>90 && a<=120) {
			System.out.println("April");
		}
		else if (a>120 && a<=151) {
			System.out.println("May");
		}
		else if (a>151 && a<=181) {
			System.out.println("June");
		}
		else if (a>181 && a<=212) {
			System.out.println("July");
		}
		else if (a>212 && a<=243) {
			System.out.println("August");
		}
		else if (a>243 && a<=273) {
			System.out.println("September");
		}
		else if (a>273 && a<=304) {
			System.out.println("October");
			
		}
		else if (a>304 && a<=334) {
			System.out.println("November");
		}
		else if (a>334 && a<=365) {
			System.out.println("December");
		}
		}
		if(b%4==0) {
			System.out.println("Enter any day");
			a=s1.nextInt();
			
		
		if (a<=31 ) {
			System.out.println("January");
		}
		else if (a>31 && a<=60) {
				System.out.println("Feb");
			}
		else	if (a>60 && a<=91) {
				System.out.println("March");
			}
		else if (a>91 && a<=121) {
			System.out.println("April");
		}
		else if (a>121 && a<=152) {
			System.out.println("May");
		}
		else if (a>152 && a<=182) {
			System.out.println("June");
		}
		else if (a>182 && a<=213) {
			System.out.println("July");
		}
		else if (a>213 && a<=244) {
			System.out.println("August");
		}
		else if (a>244 && a<=274) {
			System.out.println("September");
		}
		else if (a>274 && a<=305) {
			System.out.println("October");
			
		}
		else if (a>305 && a<=335) {
			System.out.println("November");
		}
		else if (a>335 && a<=366) {
			System.out.println("December");
		}
	}
	}
}