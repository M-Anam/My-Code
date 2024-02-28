package basicprograms;

public class Constrt {
	
	Constrt(){                                //constructor
		System.out.println("Atleast Learn");
	}

	void add() {                              //non static method
		
		System.out.println("Addition");
	}
	void substract() {
		System.out.println("Substraction");
	}
	
	public static void multiply() {           // static method
		System.out.println("Multiplication");
	}
	
	static void divide() {
		System.out.println("Division");
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		Constrt c1= new Constrt();            //object
		c1.add();
		c1.substract();
		divide();
		multiply();
		

	}

}
