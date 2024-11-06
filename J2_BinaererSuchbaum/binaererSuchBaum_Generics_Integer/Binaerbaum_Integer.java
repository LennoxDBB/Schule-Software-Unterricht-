package binaererSuchBaum_Generics_Integer;

import binaererSuchBaum_Generics.*;

public class Binaerbaum_Integer<Typ> extends Binaerbaum<Typ> {

	public void einfuegen( Typ pInhalt ) {
		
		if ( wurzel != null ) {
			// in den Baum einfuegen, rekursiv bei der Wurzel beginnen
			wurzel.einfuegen(pInhalt); 
		} else {
			// neues Wurzel-Blatt anlegen
			wurzel = new Knoten_Integer<Typ> (pInhalt); 
		}
	}
}
