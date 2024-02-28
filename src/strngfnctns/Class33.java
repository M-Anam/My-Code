package strngfnctns;

public class Class33 {

	public static void main(String[] args) {

		String name="Virat";
		String name1="Virat Kohli";
		boolean ans=name.matches("..r..");//r is at 3rd place
		System.out.println(ans);
		boolean ans1=name1.matches("..r(.*)"); //name length is more and we dont knw wht is length aftr that lttr
		System.out.println(ans1);
		boolean ans2=name1.matches("(.*)t(.*)"); //We only know the length but only knw this lettr is present somewhr in btwn
		System.out.println(ans2);
		
	}

}
