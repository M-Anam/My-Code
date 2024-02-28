package strngfnctns;

import java.util.Arrays;

public class StrngPrcts {

	public static void main(String[] args) {

		int rollNo[]=new int[3];
		rollNo[0]=91;
		rollNo[1]=75;
		rollNo[2]=23;
		//rollNo[3]=45;  //ArrayIndexOutOfBoundsException
		
		System.out.println(Arrays.toString(rollNo));
		
	}

}