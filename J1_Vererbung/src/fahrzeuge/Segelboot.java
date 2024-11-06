package fahrzeuge;

public class Segelboot extends Wasserfahrzeug {
	
	private int segelflaeche;
	
	public Segelboot(String p_bezeichnung, int p_baujahr) {
		super(p_bezeichnung, p_baujahr);
	}
	
	public void fahren() {
		//Do something
	}

	public int getSegelflaeche() {
		return segelflaeche;
	}

}
