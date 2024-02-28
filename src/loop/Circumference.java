package loop;

public class Circumference {
	int a=5;
	int b=4;
	int r=3;
	int c;
	double d;
	void CircumferenceOfSquare()
	{
		c=4*a;
		System.out.println(c);
	}
	void CircumferenceOfReactangle()
	{
		c=(2*a)+(2*b);
		System.out.println(c);	
	}
	
	void CircumferenceOfCirle()
	{
		d=2*3.14*r;
		System.out.println(d);	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circumference c1= new Circumference();
		c1.CircumferenceOfSquare();
		c1.CircumferenceOfReactangle();
		c1.CircumferenceOfCirle();
	}

}
