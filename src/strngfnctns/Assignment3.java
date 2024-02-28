package strngfnctns;

import java.util.Arrays;

public class Assignment3 {

	public static void main(String[] args) {

		String name="50 cents ";
		int noOfCharDigit=0;
		//int noOfDigit=0;
		int noOfSpace=0;
		char a1[]=name.toCharArray();
		
		System.out.println(Arrays.toString(a1));
		
		for(int i=0;i<=a1.length-1;i++) {
			//boolean b= Character.isDigit(a1[i]);
			boolean b=Character.isWhitespace(a1[i]);
			if(b==true) {
				noOfSpace++;
			}
			else {
				noOfCharDigit++;
				//noOfDigit++;


			}
		}
		System.out.println("The number of spaces are:->"+noOfSpace);
		System.out.println("The number of alphabets&numeric value are:->"+noOfCharDigit);
		
	}

}
