import java.util.Scanner;

public class Aufgabe2_1 {
	
public static void main(String[] args) {
		
		int limit = 100;
		float price = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Preise Ihrer Produkte an (in €)");
		
		do {
			price += scanner.nextFloat();
		} while(price < limit);
		
		System.out.println("Der Gesamtpreis beträgt: " + price + "€\nSie haben ihr Limit um " + (price - limit) + "€ überschritten!");
		
		scanner.close();
	}
	
}
