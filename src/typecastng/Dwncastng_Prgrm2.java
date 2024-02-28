package typecastng;
class GrandParent{
	void add() {
		
	}
}

class Parent extends GrandParent{
	void substract() {
		
	}
}
public class Dwncastng_Prgrm2 extends Parent{

	void multiply() {
		
	}
	public static void main(String[] args) {

		Parent p1= new Dwncastng_Prgrm2(); //implicit upcstng
		p1.add(); //can access method of objct class
		p1.substract();
		
		Dwncastng_Prgrm2 p2= (Dwncastng_Prgrm2) p1;  //downcastng
		p2.add();
		p2.substract();
		p2.multiply();
	}
}