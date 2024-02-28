package inheritnc;
class GrandParent{
	GrandParent(char a){
		System.out.println("GrandParent constructor");
	}
	
}
class Teacher1 extends GrandParent{
	
	Teacher1(String a)
	{
		super('j');           //explicit super calling constructor
		System.out.println("Teacher constructor");
	}
}
public class ChildClass extends Teacher1 {

	ChildClass(){
		super("Virat");         //Parameterized explicit super calling constructor
		System.out.println("Child constructor");
	}
	public static void main(String[] args) {
		new ChildClass();
		//new Teacher1();
	}

}
