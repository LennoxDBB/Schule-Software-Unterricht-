import java.text.DecimalFormat;
import java.util.Scanner;

public class Aufgabe2b {
		
	public static void main(String[] args) {
	
		String formatPattern = "###,###.###";
		DecimalFormat df = new DecimalFormat(formatPattern);	
		
		
		float kopiePreis = 0.05f;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die monatlichen Mietkosten an (in €):");
		float mietePreis = scanner.nextFloat();
		
		System.out.println("Bitte geben Sie die Anzahl der verkauften Kopien an:");
		int kopieVerkauft = scanner.nextInt();
		
		System.out.println("Bitte geben Sie die Kosten pro verkaufte Kopie an (in €):");
		float kostenPreis = scanner.nextFloat();
		
		scanner.close();
		
		System.out.println("");
		
		float gewinn = Math.round((kopieVerkauft * (kopiePreis - kostenPreis) - mietePreis) * 100f) / 100f;
		
		System.out.println("Monatliche Bilanz " + df.format(gewinn) + "€");
		
	}
	

	
}
