package methodoverrd;

public class Login {

	Login(){
		System.out.println("1");
	}
	Login(String a){
		this();
		System.out.println("2");

	}
	Login(char b){
		this(5);
		System.out.println("3");

	}
	Login(int a){
		this("Virat");
		System.out.println("4");

	}
	Login(int a,int b,int c){
		this('A');
		System.out.println("5");

	}
	
	public static void main(String[] args) {

		new Login(5,9,5);
	}

}
