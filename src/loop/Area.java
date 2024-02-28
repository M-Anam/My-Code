package loop;

public class Area {
	
	int a=5;
	int b=4;
	int h=2;
	int r=3;
	int c;
	double d;
	void AreaOfSquare()
	{
		c=a*a;
		System.out.println(c);
	}
	void AreaOfReactangle()
	{
		c=a*b;
		System.out.println(c);	
	}
	void AreaOfTraingle()
	{
		d=(b*h)*1/2;
		System.out.println(d);	
	}
	void AreaOfCirle()
	{
		d=3.14*r*r;
		System.out.println(d);	
	}
	
	public static void main(String[] args) {
		
		Area a1= new Area();
		a1.AreaOfSquare();
		a1.AreaOfReactangle();
		a1.AreaOfTraingle();
		a1.AreaOfCirle();
	
	}
}
