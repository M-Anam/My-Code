package variables;

public class First {

	static int no1=10;
	static int no2=20;

	void add() {
		no1=50;
		int sum = no1+no2;
		System.out.println(sum);
	}
	void substract() {
		int no2=200;  //use int if want to use only for this block i.e.locally
		int sub = no1-no2;
		System.out.println(sub);
	}
	void multiply() {
		int mul = no1*no2;
		System.out.println(mul);
	}
	void divide() {
		int div = no2/no1;
		System.out.println(div);
	}
	public static void main(String[] args) {
		First f1=new First();
		f1.add();
		f1.substract();
		f1.divide();
		f1.multiply();
	}
}
