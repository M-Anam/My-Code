package inheritnc;
class Country
{
	void nh_road()                    // non-static method in parent class
	{
		System.out.println("Country Road");
	}
}
class State_Class extends Country{
	static void st_road() 
	{
		System.out.println("State Road");
	}
}

public class City_Class extends State_Class {

	static void ct_road() 
	{
		System.out.println("City Road");
	}
	
	public static void main(String[] args) {
		City_Class c1=new City_Class();   // object of sub-class should be created
		ct_road();
		st_road();
		c1.nh_road();
	}
}