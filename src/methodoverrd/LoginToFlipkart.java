package methodoverrd;

public class LoginToFlipkart {

	LoginToFlipkart(){
		
		System.out.println("1");
	}

	LoginToFlipkart(int a){
		this();    //this calling statement
		System.out.println("2");
	}
	public static void main(String[] args) {

		new LoginToFlipkart(100);
	}

}
