import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		int limit = 100;
		float price = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Preise Ihrer Produkte an (in �)");
		
		while(price < limit) {
			price += scanner.nextFloat();
		}
		
		System.out.println("Der Gesamtpreis betr�gt: " + price + "�\nSie haben ihr Limit um " + (price - limit) + "� �berschritten!");
		
		scanner.close();
	}
	
}
