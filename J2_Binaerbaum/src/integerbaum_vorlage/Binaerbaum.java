package integerbaum_vorlage;

public class Binaerbaum<Typ extends Comparable<Typ>>{

	private Knoten<Typ> wurzel;
	
	Knoten<Typ> gibWurzel() {
		return wurzel;
	}
	
	void setzeWurzel( Knoten<Typ> pWurzel ) {
		wurzel = pWurzel;
	}
	
	boolean istLeer() {
		if ( wurzel == null ) {
			return true;
		}
		return false;
	}
	
	int anzahlKnoten() {
		if(wurzel == null) return 0;
		
		return wurzel.anzahlKnoten();
	}
	
	int anzahlBlaetter() {
		if(wurzel == null) return 0;
		
		return wurzel.anzahlBlaetter();
	}
	
	int tiefe() {
		if(wurzel == null) return -1;
		
		return wurzel.tiefe() - 1;
	}
	
	void ausgebenDatenInorder() {
		if(wurzel == null) return;
		
		wurzel.ausgebenDatenInorder();
	}
	
	void ausgebenDatenPreorder() {
		if(wurzel == null) return;
		
		wurzel.ausgebenDatenPreorder();
	}

	void ausgebenDatenPostorder() {
		if(wurzel == null) return;
		
		wurzel.ausgebenDatenPostorder();
	}
	
	void ausgebenDatenRKL() {
		if ( wurzel != null ) {
			System.out.println();
			wurzel.ausgebenDatenRKL("", "");
			System.out.println();
		}
	}
	
	void erstelleBaum(Knoten<Typ>[] knoten) {
		wurzel = knoten[0];
		
		Knoten<Typ> aktuellerKnoten = wurzel;
		
		for(int i = 1; i < knoten.length; i++) {
			for(int j = 0; j < knoten.length; j++) {
				if(knoten[i].gibInhalt().compareTo(aktuellerKnoten.gibInhalt()) < 0) {
					if(aktuellerKnoten.gibLinkenKnoten() == null) {
						aktuellerKnoten.setzeLinkenKnoten(knoten[i]);
						break;
					} else {
						aktuellerKnoten = aktuellerKnoten.gibLinkenKnoten();
					}
				} else {
					if(aktuellerKnoten.gibRechtenKnoten() == null) {
						aktuellerKnoten.setzeRechtenKnoten(knoten[i]);
						break;
					} else {
						aktuellerKnoten = aktuellerKnoten.gibRechtenKnoten();
					}
				}
				
				aktuellerKnoten = knoten[j];
			}
		}
	}
	
}
