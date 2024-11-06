package polymorphie;

public class Wasserf_Motorboot extends Wasserfahrzeug {

	public void zeigen()
	{
		System.out.println("Brumml-Brumml-Brumml");		
	}

	@Override
	public void info() {
		System.out.println("Ich bin ein Motorboot!");
	}
	
	public void gibTankStatus(int prozent) {
		System.out.println("Mein Tank ist zu " + prozent + "% voll!");
	}
	
}
