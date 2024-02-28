package loop;
public class Operators 
{
	static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	static void subtract()
	{
		int a=10;
		int b=20;
		int c=b-a;
		System.out.println(c);
	}
	void multiply()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	void divide()
	{
		int a=10;
		int b=20;
		int c=b/a;
		System.out.println(c);
	}
	void reminder()
	{
		int a=10;
		int b=21;
		int c=b%a;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
	add();
	subtract();
	Operators o1= new Operators();
	o1.multiply();
	o1.divide();
	o1.reminder();
	}

}
