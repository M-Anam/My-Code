package strngfnctns;

public class Asngmnt {

	public static void main(String[] args) {

		String a="I love Cricket";
		
		for(int i=0;i<a.length();i++) {
			char b=a.charAt(i);
			System.out.println(b);
		}
		
		System.out.println("--------------");
		
		String c ="Virat";
		for(int j=c.length()-1;j>=0;j--) {  
			char d=c.charAt(j);
			System.out.println(d);
		}
	}
}