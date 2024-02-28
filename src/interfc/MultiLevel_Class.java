package interfc;
interface Amazon{
	void username();
	void password();
}
abstract class AmazonLogin implements Amazon{
	abstract void Login();
	static void OTP() {
		System.out.println("OTP will be provided");
	}
}
public class MultiLevel_Class extends AmazonLogin{

	public static void main(String[] args) {
		MultiLevel_Class m1= new MultiLevel_Class();
		m1.username();
		m1.password();
		m1.Login();
		OTP();
	}

	@Override
	void Login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void username() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void password() {
		// TODO Auto-generated method stub
		
	}

}
