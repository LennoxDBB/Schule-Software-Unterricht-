import java.util.Scanner;

public class Aufgabe2a {
	
	public static void main(String[] args) {
		
		float mietePreis = 192f;
		float kostenPreis = 0.032f;
		float kopiePreis = 0.05f;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Anzahl der verkauften Kopien an:");
		int kopieVerkauft = scanner.nextInt();
		
		scanner.close();
		
		float gewinn = Math.round((kopieVerkauft * (kopiePreis - kostenPreis) - mietePreis) * 100f) / 100f;
		
		System.out.println("Monatliche Bilanz " + gewinn + "€");
	}
	
	
}
