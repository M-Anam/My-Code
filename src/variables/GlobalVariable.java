package variables;

public class GlobalVariable {

	int a=100;// non-static global variable
	static String a1="Se";
	int b;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a1);
		GlobalVariable g1=new GlobalVariable(); //to call non-static global variable
		
		System.out.println(g1.a);
		System.out.println(g1.b);
		
	}

}
