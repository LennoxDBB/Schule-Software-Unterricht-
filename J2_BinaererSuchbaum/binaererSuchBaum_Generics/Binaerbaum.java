package binaererSuchBaum_Generics;

public abstract class Binaerbaum<Typ> {

	protected Knoten<Typ> wurzel;
	
	Knoten<Typ> gibWurzel() {
		return wurzel;
	}
	
	public void setzeWurzel( Knoten<Typ> pWurzel ) {
		wurzel = pWurzel;
	}
	
	public boolean istLeer() {
		if ( wurzel == null ) {
			return true;
		}
		return false;
	}
	
	public void ausgebenDatenInorder() {
		if ( wurzel != null ) {
			wurzel.ausgebenDatenInorder();
		}
	}
	
	public void ausgebenDatenPreorder() {
		if ( wurzel != null ) {
			wurzel.ausgebenDatenPreorder();
		}
	}

	public void ausgebenDatenPostorder() {
		if ( wurzel != null ) {
			wurzel.ausgebenDatenPostorder();
		}
	}
	
	public void ausgebenDatenRKL() {
		if ( wurzel != null ) {
			System.out.println();
			wurzel.ausgebenDatenRKL("", "");
			System.out.println();
		}
	}
	
	public int anzahlKnoten() {
		if ( wurzel == null ) {
			return 0;
		}
		return wurzel.anzahlKnoten();
	}

	public int anzahlBlaetter() {
		if ( wurzel == null ) {
			return 0;
		}
		return wurzel.anzahlBlaetter();
	}
	
	public int tiefe() {
		if ( wurzel == null ) {
			return -1;
		}
		return wurzel.tiefe(-1);
	}
	
	public int tiefe_v2() {
		if ( wurzel == null ) {
			return -1;
		}
		return wurzel.tiefe_v2();
	}
	

	public abstract void einfuegen( Typ pInhalt );
	
	
/*	void einfuegen_int( Typ pInhalt ) {
		if ( wurzel != null ) {
			// in den Baum einfuegen, rekursiv bei der Wurzel beginnen
			wurzel.einfuegen_int(pInhalt); 
		} else {
			// neues Wurzel-Blatt anlegen
			wurzel = new Knoten<Typ> (pInhalt); 
		}
		
	} */
	
}
