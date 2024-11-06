package binaererSuchBaum_Generics_Integer;

import binaererSuchBaum_Generics.*;

public class InhaltsTyp_Integer extends InhaltsTyp {

	private int inhalt_int;
	
	public InhaltsTyp_Integer( int pInhalt ) {
		inhalt_int = pInhalt;
	}
	
	public int getIntegerInhalt() {
		return inhalt_int;
	}
	
	public void ausgebenDaten() {
		System.out.print( inhalt_int + " ");
	}
}
