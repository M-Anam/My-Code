package loop;

public class ForLoopEvenOdd {
	
	static void EvenOdd() {
		
		for(int i=1;i<=100;i++) {
			
			if(i%2==0) {
				System.out.println("Even number"+i);
			}
			else {
				System.out.println("Odd number"+i);
			}
		}
	}
	static void incremnt() {
		for(int j=2;j<=100;j++) 
		{
			System.out.println("Number"+(j+2));
		}
	}
	public static void main(String[] args) {
		
		EvenOdd();
		incremnt();
	}
}