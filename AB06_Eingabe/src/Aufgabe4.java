import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
				
		float wechsel = 0.72f;
		float gebühr = 0.05f;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Ihren Dollar-Betrag an:");
		float money = scanner.nextFloat();
		
		float euro = money * wechsel;
		float ende = euro * gebühr;
		float auszahlung = euro - ende;
		
		System.out.println("");
		System.out.println("Ihre Einzahlung: " + money + "$");
		System.out.println("Ihr Euro-Wert (vor Gebühren): " + Math.round(euro * 100f) / 100f + "€");
		System.out.println("Einbehalt durch Gebühren: " + Math.round(ende * 100f) / 100f + "€");
		System.out.println("Ihre Auszahlung: " + Math.round(auszahlung * 100f) / 100f + "€");
		
		scanner.close();
		
	}
	
}
