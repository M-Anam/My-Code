package typecastng;

class GrandParent_class{
	void add() {
		
	}
}

class Parent_class extends GrandParent_class{
	void substract() {
		
	}
}
public class Upcstng_program2 extends Parent_class{

	void multiply() {
		
	}
	public static void main(String[] args) {

		Parent_class p1= new Upcstng_program2(); //implicit upcstng
		p1.add(); //can access method of objct class
		p1.substract();
	}
}