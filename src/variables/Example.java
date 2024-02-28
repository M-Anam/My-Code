package variables;

public class Example {

	int age;
	String name;
	double salary;
	
	void add(int age,String name,double salary) 
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		
		Example e1=new Example();
		e1.add(37, "Virat", 9568785.235);

		System.out.println(e1.age);  //non-static global variable
		System.out.println(e1.name);
		System.out.println(e1.salary);
	}
}
