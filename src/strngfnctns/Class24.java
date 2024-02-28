package strngfnctns;

public class Class24 {

	public static void main(String[] args) {

		String a="Best test captain Virat";
		System.out.println(a.toUpperCase());
		String b="Best ODI captain Williamson";
		System.out.println(b.toLowerCase());
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		String c= "Palindrome";
		System.out.println(c.substring(5));
		System.out.println(c.substring(2, 6));  //will print string strt with 2index & ends with 6-1=5 index
		System.out.println(c.endsWith("Z"));


		
		


	}

}
