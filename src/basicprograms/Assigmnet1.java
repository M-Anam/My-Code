package basicprograms;

public class Assigmnet1 {

	static void PreCondition()         // static method
	{
		System.out.println("PreCondition");
	}
	static void PostCondition()
	{
		System.out.println("PostCondition");
	}
	void add()                         // non static(Create object in main method & call using reference variable)
	{
		System.out.println("TestCase");	
	}
	void substract()
	{
		System.out.println("Testcase1");	
	}
	
	
	public static void main(String[] args) {

		NonStatic a1= new NonStatic();
		PreCondition();
		a1.add();
		a1.substract();
		PostCondition();
	}

}
