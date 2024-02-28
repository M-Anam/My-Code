package basicprograms;

public class ConstructorExample {
	
	ConstructorExample(){
		System.out.println("This is my my Constructor");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		ConstructorExample c1= new ConstructorExample();  //After creating object- constructor gets called.

	}

}
