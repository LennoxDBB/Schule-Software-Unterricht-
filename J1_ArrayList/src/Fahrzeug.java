public class Fahrzeug {

	private String bezeichnung;
	private int baujahr;
	
	public Fahrzeug(String bezeichnung, int baujahr) {
		this.bezeichnung = bezeichnung;
		this.baujahr = baujahr;
	}
	
	public void ausgeben() {
		System.out.println(bezeichnung + " (" + baujahr + ")");
	}
	
}
