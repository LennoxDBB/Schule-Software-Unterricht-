public class Main {
	
	static VerketteteListe<Kontakt> liste = new VerketteteListe<Kontakt>();
	
	public static void main(String[] args) {
		Kontakt simon = new Kontakt("Simon", "Korbel", "korbelsimon@aol.com", "015735302429");
		Kontakt lennox = new Kontakt("Lennox", "Dobrokovsky", "dobrokovsky@gmail.com", "01729939389"); 
		Kontakt giona = new Kontakt("Giona", "Guelfi", "gionaguelfi@gmail.com", "01723696859");
				
		liste.anhaengen(simon);
		liste.anhaengen(lennox);
		liste.anhaengen(giona);
		
		ausgebenKontakte();
		
		String istSimonEnthalten = liste.istEnthalten(simon) ? "Ja" : "Nein";
		System.out.println("Ist Simon in der Liste? " + istSimonEnthalten);
	}
	
	public static void ausgebenKontakte() {
		System.out.println("[");
		for(int i = 0; i < liste.gibLaenge(); i++) {
			liste.gibKnoten(i).gibInhalt().ausgebenKontakt();
		}
		System.out.println("]");
	}
	
}
