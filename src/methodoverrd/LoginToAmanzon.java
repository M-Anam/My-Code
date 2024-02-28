package methodoverrd;

public class LoginToAmanzon {
	
	LoginToAmanzon(){
		this(45);  //output:2
		System.out.println("1");
	}

	LoginToAmanzon(int a){
		System.out.println("2");
	}
	public static void main(String[] args) {

		new LoginToAmanzon();
	}

}
