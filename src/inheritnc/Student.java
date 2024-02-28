package inheritnc;

public class Student extends Teacher   //this is how we can create relationship btwn two classes
{

	static void learn_java(){

		System.out.println("Learning Java");
	}
	static void learn_selenium(){
	
		System.out.println("Learning selenium");
	}
	public static void main(String[] args) {
		learn_java();
		learn_selenium();
		Student s2=new Student();
		java_knowledge();
		s2.selenium_knowledge();

	}

}
