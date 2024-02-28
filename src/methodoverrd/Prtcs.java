package methodoverrd;

import java.util.Scanner;

class prcts{
	Scanner s1=new Scanner(System.in);
	void add() {
		System.out.println("print first number and press enter");
		int a=s1.nextInt();
		System.out.println("print second number and press enter");
		int b=s1.nextInt();
		int c=a+b;
		System.out.println("Addition: "+c);
	}
}
public class Prtcs extends prcts{

	void add() {   
	
		super.add(); 
		System.out.println("print first number and press enter");
		int d=s1.nextInt();
		System.out.println("print second number and press enter");
		int  e=s1.nextInt();
		int f=e*d;
		System.out.println("Multiplication"+f);
	}
	public static void main(String[] args) {

		Prtcs p1=new Prtcs();
		p1.add();
						
		}
	}

