package collectn;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedSetPrgrm {

	public static void main(String[] args) {
		LinkedList a1=new LinkedList();
		a1.add(18);
		a1.add(45);
		a1.add(7);
		a1.add(17);
		a1.add(22);
		a1.add(66);
		a1.add(56);
		Collections.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);

	}

}
