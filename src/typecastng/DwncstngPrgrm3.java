package typecastng;
class GrandParent_class1{
	void add() {
		
	}
}

class Parent_class1 extends GrandParent_class1{
	void substract() {
		
	}
}
public class DwncstngPrgrm3 extends Parent_class1{

	void multiply() {
		
	}
	public static void main(String[] args) {

		Parent_class1 p1= new DwncstngPrgrm3(); //upcstng implicit
		p1.add();
		p1.substract();
		
		GrandParent_class1 p2= new DwncstngPrgrm3();
		//GrandParent_class p2= (GrandParent_class)new DwncstngPrgrm3();//explicit
		DwncstngPrgrm3 p3=(DwncstngPrgrm3)p1; //downcstng
		p3.add();
		p3.substract();
		p3.multiply();		
	}
}