package interfc;
//how to acheive MultipleLevel Inheritnc
interface Parent1{
	void add();
}
interface Parent2{
	void substract();
}
public class MultipleLevelInherintnc implements Parent1,Parent2{

	void mul() {
		
	}
	static void div() {
		
	}
	public static void main(String[] args) {

		MultipleLevelInherintnc m1=new MultipleLevelInherintnc();
		
	}

	@Override
	public void substract() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
