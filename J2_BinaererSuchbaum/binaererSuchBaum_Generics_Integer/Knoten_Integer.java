package binaererSuchBaum_Generics_Integer;

import binaererSuchBaum_Generics.*;

public class Knoten_Integer<Typ> extends Knoten<Typ> {
	
	
	Knoten_Integer( Typ pInhalt ) {
		inhalt = pInhalt;
	}
	
	
	public void einfuegen( Typ pInhalt ) {
		
		
		InhaltsTyp_Integer einzuguegendes_InhaltsObjekt = (InhaltsTyp_Integer)pInhalt;
		InhaltsTyp_Integer aktuellesKnotenInhalt = (InhaltsTyp_Integer)inhalt;
		
		if ( einzuguegendes_InhaltsObjekt.getIntegerInhalt() == aktuellesKnotenInhalt.getIntegerInhalt() ) {
			// Integerzahl ist bereits im Baum ==> nichts zu tun
			return;
		}
		
		if ( einzuguegendes_InhaltsObjekt.getIntegerInhalt() < aktuellesKnotenInhalt.getIntegerInhalt() ) {
			if ( linkerKnoten != null ) {
				// in den linken Teilbaum einfügen (rekursiver Aufruf)
				linkerKnoten.einfuegen(pInhalt); 
			} else {
				// neues Blatt anlegen und links anhaengen
				linkerKnoten = new Knoten_Integer<Typ> (pInhalt); 
			}
			
		} else {
			// der einzufügende Inhalt muss größer sein als der Inhalt des aktuellen Knotens 
			if ( rechterKnoten != null ) {
				// in den rechten Teilbaum einfügen (rekursiver Aufruf)
				rechterKnoten.einfuegen(pInhalt); 
			} else {
				// neues Blatt anlegen und rechts anhaengen
				rechterKnoten = new Knoten_Integer<Typ> (pInhalt); 
			}
		}
		
	}
	
}
