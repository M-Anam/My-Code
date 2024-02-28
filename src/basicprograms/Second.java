package basicprograms;

public class Second {
	
	Second(){
		System.out.println("This is non - parameterized constructor");
	}

	Second(int a){
		int c= a+5;
		System.out.println(c);
	}
	Second(boolean a){
		System.out.println(a);
	}
	Second(String a){
		System.out.println("This is a string");
	}
	Second(char a){
		System.out.println('A');
	}
	
	public static void main(String[] args) {
		new Second(3);
		new Second();             //2nd way to create object
		new Second(true);  
		new Second("sgd"); 
		new Second('a');

	}

}
