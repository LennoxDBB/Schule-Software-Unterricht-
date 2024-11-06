package polymorphie;

public class Wasserf_Segelboot extends Wasserfahrzeug {

	public void zeigen()
	{
		System.out.println("Sch-Sch-Sch");		
	}

	@Override
	public void info() {
		System.out.println("Ich bin ein Segelboot!");
	}
	
	public void gibAnzahlSegel(int anzahlSegel) {
		System.out.println("Mein Boot hat " + anzahlSegel + " Segel!");
	}
}
