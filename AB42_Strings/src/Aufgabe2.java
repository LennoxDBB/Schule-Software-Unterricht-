public class Aufgabe2 {
	
	public static void main(String[] args) {		
		String iban = "DE64785398120001151912";
		
		System.out.println("Ihr L�nderk�rzel: " + iban.substring(0, 2));
		System.out.println("Ihre Pr�fziffer: " + iban.substring(2, 4));
		System.out.println("Ihre Bankleitzahl: " + iban.substring(5, 12));
		System.out.println("Ihre Kontonummer: " + iban.substring(12, 22));
	}
	
}
