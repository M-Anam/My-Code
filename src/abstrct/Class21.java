package abstrct;

abstract class Class22{
	
	abstract void Login(); // only this will be exposed to 3rd party
	
}
public class Class21 extends Class22{

	public static void main(String[] args) {
		
		Class21 c1= new Class21();
		c1.Login();

	}
	void Login() {
		System.out.println("Logic");
	}
}