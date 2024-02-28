package abstrct;

abstract class AmLog{
	abstract void Login();
}

public class AmazonLogin extends AmLog {
	public static void main(String[] args) {
		
		AmazonLogin a1= new AmazonLogin();
		a1.Login();
		
	}

	void Login() {
		System.out.println("Internal Logic");
	}
}