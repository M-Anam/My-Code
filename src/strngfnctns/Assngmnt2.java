package strngfnctns;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Assngmnt2 {

	public static void main(String[] args) {
		
		
		int rollNo[]=new int[4];
		rollNo[0]=91;
		rollNo[1]=75;
		rollNo[2]=23;
		rollNo[3]=35;
		
		int myinput=35;
		
		for(int i=0;i<=3;i++) {
			if(myinput==rollNo[i]) {
				System.out.println("Given no.is present");
				System.out.println("Index of number is:->"+i);
			}	
			else {
				System.out.println("Given no.is not present");

			}
		}		
	}
}
