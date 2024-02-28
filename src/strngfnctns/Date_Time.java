package strngfnctns;

import java.util.Date;

public class Date_Time {

	public static void main(String[] args) {

		Date d1=new Date();
		System.out.println(d1.getTime()); //this will give output as epoch time
		Date d2=new Date(d1.getTime());
		System.out.println("Current time:- "+d2);  //human understandable time
		
		//how to find future time(1000-milisec->60sec->60min->24hrs->6days)this takes time in miliscnd
		
		Date d3=new Date(d1.getTime()+(1000*60*60*24*6));
		System.out.println("Future time:- "+d3);
		
		//how to find past date
		Date d4=new Date(d1.getTime()-(1000*60*60*24*6));
		System.out.println("Past time:- "+d4);
	}

}
