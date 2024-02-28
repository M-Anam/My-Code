package typecastng;
class Program2{
	void add() {
		
	}
	void substract() {
		
	}
}

public class Upcstng_Program1 extends Program2 {

	void multiply() {
		
	}
	public static void main(String[] args) {
		Program2 p1= new Upcstng_Program1(); //upcasting implicit
		p1.add();
		p1.substract();
		//Program2 p1= (Program2)new Upcstng_Program1(); //explicit upcasting
		
		Upcstng_Program1 p2=new Upcstng_Program1(); //create objct of child to access 
		p2.multiply();	
		
		Upcstng_Program1 p3= (Upcstng_Program1) p1; //downcasting
		}
	}