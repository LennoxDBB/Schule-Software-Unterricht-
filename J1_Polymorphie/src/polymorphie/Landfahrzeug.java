package polymorphie;

public class Landfahrzeug extends Fahrzeug {

	public void zeigen()
	{
		System.out.println("Holterdipolter");		
	}
	
	public void fahrenBergAuf() {
		System.out.println("Landfahrzeug fährt bergauf");
	}

	@Override
	public void info() {
		System.out.println("Ich bin ein Landfahrzeug!");
	}
		
}
