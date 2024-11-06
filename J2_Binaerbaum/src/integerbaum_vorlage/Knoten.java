package integerbaum_vorlage;

public class Knoten<Typ> {
	
	private Typ inhalt;
	private Knoten<Typ> linkerKnoten;
	private Knoten<Typ> rechterKnoten;

	Knoten( Typ pInhalt ) {
		inhalt = pInhalt;
	}
	
	void setzeLinkenKnoten( Knoten<Typ> pLinks ) {
		linkerKnoten = pLinks;
	}

	void setzeRechtenKnoten( Knoten<Typ> pRechts ) {
		rechterKnoten = pRechts;
	}

	Knoten<Typ> gibLinkenKnoten() {
		return linkerKnoten;
	}
	
	Knoten<Typ> gibRechtenKnoten() {
		return rechterKnoten;
	}
	
	void setzeInhalt( Typ pInhalt ) {
		inhalt = pInhalt;
	}
	
	Typ gibInhalt() {
		return (Typ) inhalt;
	}
	
	boolean istBlatt() {
		if ( (linkerKnoten == null) && (rechterKnoten == null) ) {
			return true;
		}
		return false;
	}
	
	int anzahlKnoten() {
		int anzahl = 1;
		
		if(linkerKnoten != null) {
			anzahl += linkerKnoten.anzahlKnoten();
		}
		
		if(rechterKnoten != null) {
			anzahl += rechterKnoten.anzahlKnoten();
		}
		
		return anzahl;
	}
	
	int anzahlBlaetter() {
		int anzahl = 0;
		
		if(linkerKnoten != null) {
			anzahl += linkerKnoten.anzahlBlaetter();
		}
		
		if(rechterKnoten != null) {
			anzahl += rechterKnoten.anzahlBlaetter();
		}
		
		if(linkerKnoten == null && rechterKnoten == null) {
			return 1;
		}
				
		return anzahl;
	}
	
	int tiefe() {
		int anzahlLinks = 1;
		int anzahlRechts = 1;
		
		if(linkerKnoten != null) {
			anzahlLinks += linkerKnoten.tiefe();
		}
		
		if(rechterKnoten != null) {
			anzahlRechts += rechterKnoten.tiefe();
		}
		
		return anzahlLinks > anzahlRechts ? anzahlLinks : anzahlRechts;
	}
	
	void ausgebenDatenInorder() {		
		if(linkerKnoten != null) {
			linkerKnoten.ausgebenDatenInorder();
		}
		
		System.out.print(inhalt + "  ");
		
		if(rechterKnoten != null) {
			rechterKnoten.ausgebenDatenInorder();
		}
	}
	
	void ausgebenDatenPreorder() {
		System.out.print(inhalt + "  ");
		
		if(linkerKnoten != null) {
			linkerKnoten.ausgebenDatenPreorder();
		}
		
		if(rechterKnoten != null) {
			rechterKnoten.ausgebenDatenPreorder();
		}
	}

	void ausgebenDatenPostorder() {
		if(linkerKnoten != null) {
			linkerKnoten.ausgebenDatenPostorder();
		}
		
		if(rechterKnoten != null) {
			rechterKnoten.ausgebenDatenPostorder();
		}
		
		System.out.print(inhalt + "  ");
	}
	
	void ausgebenDatenRKL( String pPrefix, String pPfad ) {
		
		if (rechterKnoten != null) {
			rechterKnoten.ausgebenDatenRKL( pPrefix + "  ", "/");
		}
		
		System.out.println( pPrefix + pPfad + inhalt + " ");
		
		if (linkerKnoten != null) {
			linkerKnoten.ausgebenDatenRKL(pPrefix + "  ", "\\");
		}
	}
	
}
