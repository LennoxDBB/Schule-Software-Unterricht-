package binaererSuchBaum_Kontakte;

import binaererSuchBaum_Generics.Knoten;

public class Knoten_Kontakte extends Knoten<Kontakt> {
	
	public Knoten_Kontakte(Kontakt pInhalt) {
		inhalt = pInhalt;
	}

	@Override
	public void einfuegen(Kontakt pInhalt) {
		Kontakt aktuellerKontakt = (Kontakt) this.inhalt;
		Kontakt einzufuegenderKontakt = (Kontakt) pInhalt;
		
		if (einzufuegenderKontakt == aktuellerKontakt) return;

		if (einzufuegenderKontakt.getNachname().compareTo(aktuellerKontakt.getNachname()) < 0) {
			if(this.linkerKnoten != null ) {
				this.linkerKnoten.einfuegen(pInhalt); 
			} else {
				this.linkerKnoten = new Knoten_Kontakte(pInhalt);
			}
			
		} else {
			if (this.rechterKnoten != null ) {
				this.rechterKnoten.einfuegen(pInhalt); 
			} else {
				this.rechterKnoten = new Knoten_Kontakte(pInhalt);
			}
		}
	}

}
