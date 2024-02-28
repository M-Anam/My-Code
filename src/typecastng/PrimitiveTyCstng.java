package typecastng;

public class PrimitiveTyCstng {

	public static void main(String[] args) {

		int notPI= (int) 3.14;       //narrowing-- explicit way
		System.out.println(notPI);
		
		double wght= 86;    //implicit           //widening-both implicit & explicit
		System.out.println(wght);
		
		double wght1=(double) 86;
		System.out.println(wght1);
		
		byte number=63;
		long number1= (long) number;
		System.out.println(number1);
		
	}
}
