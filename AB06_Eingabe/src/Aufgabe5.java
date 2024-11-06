import java.util.Scanner;

public class Aufgabe5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie die Länge Ihrer Strecke an (in Kilometer):");
		float strecke = scanner.nextFloat();
		
		System.out.println("Geben Sie den Spritverbrauch/100km an (in Litern):");
		float spritverbrauch = scanner.nextFloat();
		
		System.out.println("Geben Sie den Spritpreis/Liter an (in Euro):");
		float spritpreis = scanner.nextFloat();
		
		System.out.println("Geben Sie die Anzahl der Mitfahrer an:");
		int mitfahrer = scanner.nextInt();
		
		scanner.close();
		
		
		float liter = (strecke / 100f) * spritverbrauch;
		float euro = liter * spritpreis;
		float betrag1 = Math.round((euro / mitfahrer) * 100f) / 100f;
		float betrag2 = Math.round((euro / (mitfahrer + 1)) * 100f) / 100f;
		
		
		System.out.println("");
		System.out.println("Ihre Strecke: " + strecke + "km");
		System.out.println("Ihr Spritverbrauch: " + spritverbrauch + "l");
		System.out.println("Ihr Spritpreis: " + spritpreis + "€");
		System.out.println("Ihre Mitfahrer: " + mitfahrer + " Mitfahrer");
		System.out.println("");
		System.out.println("Nur Ihre Mitfahrer zahlen: " + betrag1 + "€");
		System.out.println("Ihre Mitfahrer und Sie zahlen: " + betrag2 + "€");
		
	}
	
}
