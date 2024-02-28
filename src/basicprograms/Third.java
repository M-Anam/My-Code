package basicprograms;

public class Third {
	
	Third(int a,int b,int c){
		c=a+b;	
	}
	Third(int a,int c){
		System.out.println("int& int");
	}
	Third(double d,int a){
		System.out.println("double &int");
	}
	Third(boolean a,int b){
		System.out.println("boolean & int");
	}
	
	public static void main(String[] args) {
		Third t1=new Third(true,8);
		Third t2=new Third(15.5,7);
	}
}