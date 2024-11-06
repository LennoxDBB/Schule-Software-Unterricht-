package binaererSuchBaum_Kontakte;

import binaererSuchBaum_Generics.Binaerbaum;

public class Binaerbaum_Kontakte extends Binaerbaum<Kontakt> {

	@Override
	public void einfuegen(Kontakt pInhalt) {
		if ( wurzel != null ) {
			wurzel.einfuegen(pInhalt); 
		} else {
			wurzel = new Knoten_Kontakte(pInhalt);
		}
	}

}
