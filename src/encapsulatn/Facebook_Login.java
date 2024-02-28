package encapsulatn;
class Auth{
	
	private String username="contact@gmail.com";
	public void set_username(String username)
	{
		this.username=username;
	}
	public String get_username() {
		return username;
	}
	private String password="abc@123";
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
public class Facebook_Login {

	public static void main(String[] args) {

		Auth a1=new Auth();
		a1.set_username("anam@gmail.com");
		System.out.println(a1.get_username());
		
		a1.setPassword("anam123");
		System.out.println(a1.getPassword());
	}
}