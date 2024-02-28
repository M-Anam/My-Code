package excptnhndlng;

public class Class32 {

	public static void main(String[] args) {

		try {
		int c=1/0; //Assuming 1&0 coming frm prent class
		}
		catch(ArithmeticException a1) {
			System.out.println("Since the infinity cannot be stored in int datatype.We have handled it using exception handling");
			
		}
		
	
	}

}
