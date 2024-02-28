package variables;

public class SIB_IIB {

	static {
		System.out.println("This is SIB1");
	}
	SIB_IIB()
	{
		System.out.println("This is Constructor");
	}
	public static void main(String[] args) {
		System.out.println("This is main method");
		new SIB_IIB();

	}
	{
		System.out.println("This is IIB");// for IIB object creation is req
	}

}
