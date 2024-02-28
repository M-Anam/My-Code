package typecastng;
class Program4{
	void add() {
		
	}
	void substract() {
		
	}
}

public class Downcastng extends Program4 {

	void multiply() {
		
	}
	public static void main(String[] args) {
		Program4 p1= new Downcastng();    //upcasting implicit
		p1.add();
		p1.substract();
		
		Upcstng_Program1 p2=new Upcstng_Program1(); //create objct of child to access 
		p2.multiply();	
		
		Downcastng p3= (Downcastng) p1;   //down casting
		p3.add();
		p3.substract();
		p3.multiply();
		}
	}