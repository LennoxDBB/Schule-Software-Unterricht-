package fahrzeuge;

public class Landfahrzeug extends Fahrzeug {

	private int anzahlRaeder;
	
	public Landfahrzeug(String p_bezeichnung, int p_baujahr) {
		super(p_bezeichnung, p_baujahr);
	}
	
	public void fahren() {
		//Do something
	}

	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}
	
	
}
