package typecastng;
class C4{
	void add() {
		
	}
}

class C3 extends C4{
	void substract() {
		
	}
}

class C2 extends C3{
	void multiply() {
		
	}
}

public class C1 extends C2{
	
		void div() {
			
		}	
	public static void main(String[] args) {

		C4 a1= new C3();     //upcstng
		a1.add();
		
		C3 a2= new C2(); //upcastng
		a2.add();
		a2.substract();
		
		C3 a3=(C3) a2; //downcastng
		a3.add();
		a3.substract();		
	}
}