package excptnhndlng;

import java.util.Arrays;

public class ExcptnHndlngPrgrm {

	public static void main(String[] args) {

		int rollNo[]=new int[3];
		rollNo[0]=18;
		rollNo[1]=17;
		rollNo[2]=45;
		try 
		{
		rollNo[3]=7;
		}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println("AIOBE");
		}
		
		catch(NullPointerException a2) {
			System.out.println("NPE");
		}
		catch(ArithmeticException a3) {
			System.out.println("AE");
		}
		finally {
			System.out.println("No matter what finally block will always execute");
		}
		System.out.println(Arrays.toString(rollNo));

}
}
