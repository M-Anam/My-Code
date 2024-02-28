package variables;

public class AreaOfCircle {

	final static double a=3.14;
	int r=3;
	double d;
	void AreaOfCir()
	{
		d=a*r*r;
		System.out.println(d);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaOfCircle a1=new AreaOfCircle();
		a1.AreaOfCir();
	}

}
