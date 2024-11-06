package binaererSuchBaum_Generics;

public abstract class Knoten<Typ> {
	
	protected Typ inhalt;
	protected Knoten<Typ> linkerKnoten;
	protected Knoten<Typ> rechterKnoten;

	public void setzeLinkenKnoten( Knoten<Typ> pLinks ) {
		linkerKnoten = pLinks;
	}

	public void setzeRechtenKnoten( Knoten<Typ> pRechts ) {
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
	
	public Typ gibInhalt() {
		return (Typ)inhalt;
	}
	
	boolean istBlatt() {
		if ( (linkerKnoten == null) && (rechterKnoten == null) ) {
			return true;
		}
		return false;
	}
	
	void ausgebenDatenInorder() {
		if (linkerKnoten != null) {
			linkerKnoten.ausgebenDatenInorder();
		}
		
		//System.out.println( inhalt );
		InhaltsTyp myInhaltsTyp = (InhaltsTyp)inhalt;
		myInhaltsTyp.ausgebenDaten();
		
		if (rechterKnoten != null) {
			rechterKnoten.ausgebenDatenInorder();
		}
	}
	
	void ausgebenDatenPreorder() {
		//System.out.println( inhalt );
		InhaltsTyp myInhaltsTyp = (InhaltsTyp)inhalt;
		myInhaltsTyp.ausgebenDaten();
		
		if (linkerKnoten != null) {
			linkerKnoten.ausgebenDatenInorder();
		}
		
		if (rechterKnoten != null) {
			rechterKnoten.ausgebenDatenInorder();
		}
	}

	void ausgebenDatenPostorder() {
		if (linkerKnoten != null) {
			linkerKnoten.ausgebenDatenInorder();
		}
		
		if (rechterKnoten != null) {
			rechterKnoten.ausgebenDatenInorder();
		}
		//System.out.println( inhalt );
		InhaltsTyp myInhaltsTyp = (InhaltsTyp)inhalt;
		myInhaltsTyp.ausgebenDaten();
		
	}
	
	void ausgebenDatenRKL( String pPrefix, String pPfad ) {
		
		if (rechterKnoten != null) {
			rechterKnoten.ausgebenDatenRKL( pPrefix + "  ", "/");
		}
		
		System.out.print( pPrefix + pPfad );
		InhaltsTyp myInhaltsTyp = (InhaltsTyp)inhalt;
		myInhaltsTyp.ausgebenDaten();
		System.out.println("");
		
		if (linkerKnoten != null) {
			linkerKnoten.ausgebenDatenRKL(pPrefix + "  ", "\\");
		}
	}
	
	int anzahlKnoten() {
		int anzahl = 1;
		
		if (linkerKnoten != null) {
			anzahl = anzahl + linkerKnoten.anzahlKnoten();
		}
		
		if (rechterKnoten != null) {
			anzahl = anzahl + rechterKnoten.anzahlKnoten();
		}
		
		return anzahl;
	}
	
	int anzahlBlaetter() {
		int anzahl = 0;
		
		if ( istBlatt() ) {
			return 1;
		}
		
		if (linkerKnoten != null) {
			anzahl = anzahl + linkerKnoten.anzahlBlaetter();
		}
		
		if (rechterKnoten != null) {
			anzahl = anzahl + rechterKnoten.anzahlBlaetter();
		}
		
		return anzahl;
	}

	int tiefe( int pTiefeVater ) {
		int tiefe_links = 0;
		int tiefe_rechts = 0;
		
		if ( istBlatt() ) {
			return pTiefeVater + 1;
		}
		
		if (linkerKnoten != null) {
			tiefe_links = linkerKnoten.tiefe(pTiefeVater + 1);
		}
		
		if (rechterKnoten != null) {
			tiefe_rechts = rechterKnoten.tiefe(pTiefeVater + 1);
		}
		
		if (tiefe_links > tiefe_rechts) {
			return tiefe_links;
		} else {
			return tiefe_rechts;	
		}
		
	}
	
	int tiefe_v2() {
		int tiefe_links = 0;
		int tiefe_rechts = 0;
		
		if ( istBlatt() ) {
			return 0;
		}
		
		if (linkerKnoten != null) {
			tiefe_links = linkerKnoten.tiefe_v2();
		}
		
		if (rechterKnoten != null) {
			tiefe_rechts = rechterKnoten.tiefe_v2();
		}
		
		if (tiefe_links > tiefe_rechts) {
			return tiefe_links + 1;
		} else {
			return tiefe_rechts + 1;	
		}
		
	}

	
	public abstract void einfuegen( Typ pInhalt );

}
