package strngfnctns;

import java.util.Arrays;

public class AnagramArray {

	public static void main(String[] args) {

		String name="listen";
		String name1="silent";
		
		if(name.length()!=name1.length()) {
			System.out.println("They are not anagram");
		}
		else {
			char c1[]=name.toCharArray();  //o/p: l,i,s,t,e,n
			
			char c2[]=name1.toCharArray();  //o/p: s,i,l,e,n,t
			//so sorting is needed to chck whethr they have same chars
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			//System.out.println(Arrays.equals(c1, c2));
			
			if(Arrays.equals(c1, c2)==true) {
				System.out.println("The given 2 strings are anagram");
			}
			else {
				System.out.println("The given 2 strings are not anagram");
			}
			
		}
	}
}
