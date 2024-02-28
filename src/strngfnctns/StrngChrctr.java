package strngfnctns;

import java.util.Arrays;

public class StrngChrctr {

			public static void main(String[] args) 
			{
			String name="world is full of beautiful people";
			int noofchar=0;
			char c[]=	name.toCharArray();
				
			System.out.println(Arrays.toString(c));
			for(int i=0;i<c.length;i++)
			{
			boolean answer=	Character.isAlphabetic(c[i]);
			
			if(answer==true)
			{
				noofchar++;
			}
			
			}
			System.out.println("The number of alphabets are:->"+noofchar);


			if(noofchar>0) {
				System.out.println("String is not only numeric");
			}
		
	}
}

