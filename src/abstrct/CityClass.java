package abstrct;

abstract class CountryClass{
	abstract void nh_road(); // abstract method
	static void add() { //concrete method
		System.out.println("Some logic are being exposed-1");
	}
}
abstract class StateClass extends CountryClass{
	
	abstract void state_road();
	void substract() {
		System.out.println("Some logic are being exposed-2");
	}
}

public class CityClass extends StateClass {

	void multi() {
		System.out.println("Multiplication");

	}
	static void div() {
		System.out.println("Division");

	}
	public static void main(String[] args) {
		CityClass c1=new CityClass();
		c1.multi();
		div();
		c1.nh_road();
		c1.state_road();
		add();
		c1.substract();

	}
	@Override
	void state_road() {
		// TODO Auto-generated method stub
		System.out.println("Not exposed-1");
	}
	@Override
	void nh_road() {
		// TODO Auto-generated method stub
		System.out.println("Not exposed-2");
	}

}