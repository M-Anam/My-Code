package strngfnctns;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {

		int array1[]=new int[4];
		array1[0]=54;
		array1[1]=18;
		array1[2]=17;
		array1[3]=45;
		
		int array2[]=new int[array1.length];  //int[4]similar length methd
		
		for(int i=0;i<array1.length;i++) {
			
			array2[i]=array1[i];
		}
		System.out.println(Arrays.toString(array2));
	}

	
}
