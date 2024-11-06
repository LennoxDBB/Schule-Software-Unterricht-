public class VerketteteListe<Typ> {

	public Knoten<Typ> erster;
	
	public void anhaengen(Typ inhalt) {
		Knoten<Typ> knotenNeu = new Knoten<Typ>(inhalt);
		knotenNeu.setzeInhalt(inhalt);
		
		Knoten<Typ> knotenAktuell = erster;
		
		if(knotenAktuell != null) {
			for(int i = 0; i < gibLaenge() - 1; i++) {
				knotenAktuell = knotenAktuell.gibNaechster();
			}
			
			knotenAktuell.setzeNaechster(knotenNeu);
			return;
		}
		
		erster = knotenNeu;
	}
	
	public Knoten<Typ> gibKnoten(int index) {
		Knoten<Typ> knotenAktuell = erster;
				
		if(knotenAktuell != null) {
			for(int i = 0; i < index; i++) {
				knotenAktuell = knotenAktuell.gibNaechster();
			}
			
			return knotenAktuell;
		}
		
		return null;
	}
	
	public Boolean istEnthalten(Typ inhalt) {
		Knoten<Typ> knotenAktuell = erster;
		
		if(knotenAktuell != null) {
			for(int i = 0; i < gibLaenge(); i++) {
				if(knotenAktuell.gibInhalt() == inhalt) return true;
				knotenAktuell = knotenAktuell.gibNaechster();
			}
			
			return false;
		}
		
		return null;
	}
	
	public Integer gibLaenge() {
		int laenge = 0;
		Knoten<Typ> knotenAktuell = erster;
		
		while(knotenAktuell != null) {
			knotenAktuell = knotenAktuell.gibNaechster();
			laenge++;
		}
		
		return laenge;
	}
}
