package logicaloperators;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(a>=10 || a==b)
		{
			int sum=100+a+b;
			System.out.println(sum);
		}
		if(a>10 && a>b)
		{
			int subs=100-a-b;
			System.out.println(subs); //Won't execute as both conditions aren't true
		}
		if(a>5 && a<b)
		{
			int subs=100-a-b;
			System.out.println(subs); 
		}
		 
		if(!(a>10 && a>b)) 	//Not-AND
		{
			int opr=100-a+b;
			System.out.println(opr); 
		}
		if(!(a<10 || a>b)) 	//Not-OR
		{
			int opr1=100+a-b;
			System.out.println(opr1); 
		}
	}
}
