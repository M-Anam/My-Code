package methodoverrd;

class Employee{
	void add()
	{
		int a=100;
		int b=50;
		System.out.println(a+b);
	}
}
public class Manager extends Employee {     //method over-riding

	void add()
	{
	super.add();   //super keyword method  over ride to get parent class implementation
	int a=150;      //along with child class implementation
	int b=80;
	System.out.println(a+b);	
	}
	public static void main(String[] args) {
		Manager m1=new Manager();
		m1.add();
	}
}