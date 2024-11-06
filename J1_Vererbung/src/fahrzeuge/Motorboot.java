package fahrzeuge;

public class Motorboot extends Wasserfahrzeug{
	
	private int leistung;
	
	public Motorboot(String p_bezeichnung, int p_baujahr) {
		super(p_bezeichnung, p_baujahr);
	}
	
	public void fahren() {
		//Do something
	}

	public int getLeistung() {
		return leistung;
	}

}
