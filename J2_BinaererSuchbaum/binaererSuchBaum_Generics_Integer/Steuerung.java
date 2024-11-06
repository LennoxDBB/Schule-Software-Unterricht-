package binaererSuchBaum_Generics_Integer;

import binaererSuchBaum_Kontakte.Binaerbaum_Kontakte;
import binaererSuchBaum_Kontakte.Knoten_Kontakte;
import binaererSuchBaum_Kontakte.Kontakt;

public class Steuerung {

	public static void main(String[] args) {
		
		Binaerbaum_Kontakte binaerbaum = new Binaerbaum_Kontakte();

		binaerbaum.setzeWurzel(new Knoten_Kontakte(new Kontakt("Simon", "Korbel", "korbelsimon@aol.com", "015735302428")));
		
		binaerbaum.einfuegen(new Kontakt("Lennox", "Dobrokovsky", "dobrokovsky@gmail.com", "01749070189"));
		binaerbaum.einfuegen(new Kontakt("Giona", "Guelfi", "gionaguelfi@gmail.com", "01723696859"));
		binaerbaum.einfuegen(new Kontakt("Xander", "Zander", "xanderzander@gmail.com", "01752581259"));
		
		binaerbaum.ausgebenDatenRKL();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}