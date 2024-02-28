package basicprograms;

public class NonStatic {

	void add()
	{
		System.out.println("TestCase");	
	}
	void substract()
	{
		System.out.println("Testcase1");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStatic n1= new NonStatic();
		n1.add();
		n1.substract();
	}
}