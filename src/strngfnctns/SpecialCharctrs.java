package strngfnctns;

import java.util.Arrays;

public class SpecialCharctrs {

	public static void main(String[] args) {
		String name="Automation Batch @38";
		int noofchar=0;
		int noofint=0;
		int noOfSpace=0;
		int noOfSpclChrctr=0;
		char a1[]=	name.toCharArray();
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<a1.length;i++) {
			boolean alphbts=	Character.isAlphabetic(a1[i]);
			if(alphbts==true)
			{
				noofchar++;
			}
			boolean digit=	Character.isDigit(a1[i]);
			if(digit==true)
			{
				noofint++;
			}
			
			boolean Spcs=	Character.isWhitespace(a1[i]);
			if(Spcs==true)
			{
				noOfSpace++;
			}
		}
			System.out.println("My given string"+name+"has:-"+noofchar+"alphabts");
			System.out.println("My given string"+name+"has:-"+noofint+"digits");
			System.out.println("My given string"+name+"has:-"+noOfSpace+"Spaces");
			
			if(name.length()==noofchar+noofint+noOfSpace) {
				System.out.println("Doesnot not have special character");
			}
			else {
				System.out.println("Special character is present");
				
		noOfSpclChrctr=name.length()-noofchar-noofint-noOfSpace;
		System.out.println("My given string"+name+"has:-"+noOfSpclChrctr+"SpecialCharactrs");
		
					
			}
		}
}
	
