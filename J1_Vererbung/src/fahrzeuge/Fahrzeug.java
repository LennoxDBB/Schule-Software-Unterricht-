package fahrzeuge;

public class Fahrzeug {

	protected int baujahr;
	protected String bezeichnung;
	
	public Fahrzeug(String p_bezeichnung, int p_baujahr) {
		this.baujahr = p_baujahr;
		this.bezeichnung = p_bezeichnung;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void fahren() {
		//Do something
	}
	
}
