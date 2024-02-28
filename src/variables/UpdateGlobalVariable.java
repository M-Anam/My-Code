package variables;

public class UpdateGlobalVariable {

	static int a=100;
	static void add() {
		a=70;  // update the value of global variable
		int sum=a+10;
		System.out.println(sum);
	}
	
	static void substract()
	{
		int a=770; // used int so it will be a different local variable
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		add();
		substract();
		System.out.println(a);

	}
}
