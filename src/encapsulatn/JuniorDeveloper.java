package encapsulatn;

class SeniorDeveloper{
	//right clck-source-getter and setter
	private int age=18; //most sensitive info
	
	public int get_age() //getter
	{
		return age; //change the return type to int as age has int data type
		
	}
	public void set_age(int age) //setter
	{
		this.age=age;  //set the value as 72
	}
	
}

public class JuniorDeveloper {

	public static void main(String[] args) {

		SeniorDeveloper s1=new SeniorDeveloper();
		s1.set_age(72); 
		//s1.get_age();
		System.out.println(s1.get_age());
		
	}

}
