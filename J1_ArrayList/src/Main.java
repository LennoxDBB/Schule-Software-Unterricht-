import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
//		• Daimler (Baujahr 1964)
//		• BMW (Baujahr 1970)
//		• Fiat (Baujahr 1985)
//		• VW (Baujahr 1981)
//		• Peugeot (Baujahr 1985)
		
		Fahrzeug daimler = new Fahrzeug("Daimler", 1964);
		Fahrzeug bmw = new Fahrzeug("BMW", 1970);
		Fahrzeug fiat = new Fahrzeug("Fiat", 1985);
		Fahrzeug vw = new Fahrzeug("VW", 1981);
		Fahrzeug peugeot = new Fahrzeug("Peugeot", 1985);
		
		ArrayList<Fahrzeug> meineAutos = new ArrayList<Fahrzeug>();
		meineAutos.add(daimler);
		meineAutos.add(bmw);
		meineAutos.add(fiat);
		meineAutos.add(vw);
		meineAutos.add(peugeot);
		
		for(int i = 0; i < meineAutos.size(); i++) {
			meineAutos.get(i).ausgeben();
		}
		
		System.out.println("---------------------");
		System.out.println("Is the list empty? " + meineAutos.isEmpty());
		System.out.println("Does the list contains a bmw? " + meineAutos.contains(bmw));
		System.out.println("What's the position of the vw in the list? " + (meineAutos.indexOf(vw) + 1));
	}
	
}
