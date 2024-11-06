public class Knoten<Typ> {

	private Typ inhalt;
	private Knoten<Typ> naechster;

	public Knoten(Typ inhalt) {
		this.inhalt = inhalt;
	}
	
	public void setzeNaechster(Knoten<Typ> knoten) {
		naechster = knoten;
	}

	public Knoten<Typ> gibNaechster() {
		return naechster;
	}
	
	public void setzeInhalt(Typ inhalt) {
		this.inhalt = inhalt;
	}
	
	public Typ gibInhalt() {
		return this.inhalt;
	}
	
}
