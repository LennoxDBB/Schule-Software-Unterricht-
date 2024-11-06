import java.text.DecimalFormat;
import java.util.Scanner;

public class AB12_FahrpreisBerechnen {
	
	public static void main(String[] args) {
		
		String formatPattern = "###,###.##";
		DecimalFormat df = new DecimalFormat(formatPattern);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Anzahl an Personen an:");
		int mitfahrer = scanner.nextInt();
		
		System.out.println("Bitte geben Sie die gefahrenen Kilometer an:");
		int km = scanner.nextInt();
		
		scanner.close();
		
		float diff = 0f;
		if(mitfahrer <= 5 && mitfahrer > 0) {			
			if(km > 0f && km <= 100f) {
				float price = 20;
				
				System.out.println("Der Gesamtpreis beträgt: " + df.format(price) + "€");
				System.out.println("Der Preis pro Person beträgt: " + df.format(price / mitfahrer) + "€");
			} else if(km > 100f) {
				diff = km - 100f;
				float price = diff * 0.1f + 20f;
	
				System.out.println("Der Gesamtpreis beträgt: " + df.format(price) + "€");
				System.out.println("Der Preis pro Person beträgt: " + df.format(price / mitfahrer) + "€");
			} else {
				System.out.println("Du kannst keine negative Strecke fahren");
			}
		} else {
			System.out.println("Es können nur 1 - 5 Personen mitfahren!");
		}
		
	}
	
}