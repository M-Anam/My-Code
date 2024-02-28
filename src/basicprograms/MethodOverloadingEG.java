package basicprograms;

public class MethodOverloadingEG {
	void add(int a,int b,int c) {
		int d=a+b-c;
		System.out.println(d);
	}
	void add(double a,int b,int c) {
		double d=a+b+c;
		System.out.println(d);
	}
	void add(int a,double b,int c) {
		double d= a/b+c;
		System.out.println(d);
	}
	static void add(String a,char b) {
		System.out.println("Hello");
	}
	static void add(String a,String b) {
		System.out.println("Assignmnet done");
	}
	public static void main(String[] args) {
		MethodOverloadingEG m1= new MethodOverloadingEG();
		m1.add(9, 7, 5);
		m1.add(9, 7, 6);
		m1.add(9, 3, 5);
		add("hi",'A');
		add("Hi1","Hi2");
	}
}
