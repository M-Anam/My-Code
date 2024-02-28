package strngfnctns;

import java.util.Date;

public class FutureTime {

	public static void main(String[] args) {

		FutureTime f1=new FutureTime();
		
		Date d1=new Date();
		System.out.println(d1.getTime()); //epoch time
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String time=d2.toString();
		String date= time.substring(8, 10);
		System.out.println(date);
		
		String month= time.substring(4, 7);
		System.out.println(month);
		
		System.out.println(time.length());
		String year=time.substring(24);
		System.out.println(year);
		
		System.out.println(date.concat(month).concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		
		
		
		
		
		
	}

}
