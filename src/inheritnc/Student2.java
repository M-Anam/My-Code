package inheritnc;

public class Student2 extends Teacher {

	static void learn_java1(){

		System.out.println("Student Learning only Java");
	}
	public static void main(String[] args) {
		Student2 s1=new Student2();
		learn_java1();
		java_knowledge();
		s1.selenium_knowledge();
		
	}

}
