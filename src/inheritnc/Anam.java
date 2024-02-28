package inheritnc;

class Cricketers{
	static void Virat() {
		System.out.println("Best Indian test captain considered as a failed captain");
	}
	static void Rohit() {
		System.out.println("Best Indian T20 captain");
	}	
}

public class Anam extends Cricketers {

	static void IndiaCricket() 
	{
		System.out.println("BCCI is full of polictics");
	}
	
	public static void main(String[] args) {
		IndiaCricket();
		Virat();
		Rohit();
	}

}
