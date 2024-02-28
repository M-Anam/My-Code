package strngfnctns;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Arry {

	public static void main(String[] args) {

		int length[]=new int[4];
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<=3;i++) {
			System.out.println("Enter value");
			length[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(length));
		
		int Area=length[0]+length[1]+length[2]+length[3];  //2l+2b
		System.out.println(Area);
	}
}
