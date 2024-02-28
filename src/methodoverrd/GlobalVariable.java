package methodoverrd;

public class GlobalVariable {

	
	int age;
	String name;
	double salary;
	double e;
	long amount;
	
	boolean b;
	
	void add(int age,String name,double salary) {
		System.out.println("India");
		this.age=age; //this keyword(Assigning my value 45 to global variable
		this.name=name;
		this.salary=salary;
	}
	
	void add1(long amount,double e,boolean b) {
		
		this.amount=amount;
		this.e=e;
		this.b=b;
	}
	public static void main(String[] args) {
		GlobalVariable g1=new GlobalVariable();
		g1.add(35, "Virat", 785568.5);
		System.out.println(g1.age);     //accessing global variable
		System.out.println(g1.name);
		System.out.println(g1.salary);
		g1.add1(5659, 56.56, true);
		System.out.println(g1.amount);     //accessing global variable
		System.out.println(g1.e);
		System.out.println(g1.b);
	}
}
