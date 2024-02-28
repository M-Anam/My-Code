package strngfnctns;

import java.util.Arrays;

public class RevrsArry {

	public static void main(String[] args) {
		int age[]= {45,8,6,23,18};
		System.out.println(age.length);
		int revereseage[]=new int[age.length];
		int k=0;
		
		for(int i=age.length-1;i>=0;i--) {
			
			revereseage[k]= age[i];
			k++;			
		}
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(revereseage));
	}
}
