package basicprograms;

public class MethodOverloading {
	static void add() {
		System.out.println("without arg");
	}
	static void add(int a,double b) {
		double c=a/b;
		System.out.println(c);
	}

	static void add(double b,int a) {
		System.out.println("double & int");
	}
	public static void main(String[] args) {
		add();
		add(100,65.3);

	}

}
