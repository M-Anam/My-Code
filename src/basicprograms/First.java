package basicprograms;

public class First {
	
	First(){
		System.out.println("This is my Constructor");
	}

	public static void main(String[] args) {
		First f1=new First();             //1st way to create object
		//or
		new First();                      //2nd way to create object(Cannot call as it doesnot have ref varaiable which is needed to call non static method)
        // prefer 1st way
	}

}
