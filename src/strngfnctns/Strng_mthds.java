package strngfnctns;

public class Strng_mthds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Srilanka";
		int a1=name.length();
		System.out.println(a1);
		
		System.out.println(name.charAt(6));  //index strt frm 0
		System.out.println(name.indexOf('n'));
		
		String name1="is my nghbr country";
		System.out.println(name.concat(name1));
		System.out.println(name.concat("Virat"));
		System.out.println("Virat".concat(" ").concat("Kohli"));
		
		String a2="  Cricket is not just a game        ";
		System.out.println(a2);
		System.out.println(a2.trim()); //trim functns removes spaces at end & beginning
		
	}
}
