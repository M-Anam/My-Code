package interfc;
//relationshp btwn cls n interface
interface LoginDetails{
	void Login();
	void Logout();
}
public class Class22 implements LoginDetails{

	public static void main(String[] args) {
		Class22 c1=new Class22();
		c1.Login();
		c1.Logout();

	}

	@Override
	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Hidden Logic");
	}

	@Override
	public void Logout() {
		// TODO Auto-generated method stub
		System.out.println("Hidden Logic-2");

	}

}
