import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie Ihren Vornamen an \n>> ");
		String firstName = scanner.next();
		
		System.out.print("\nBitte geben Sie Ihren Nachnamen an \n>> ");
		String lastName = scanner.next();
		
		System.out.println("\nIhre Initialen sind: " + firstName.toUpperCase().charAt(0) + lastName.toUpperCase().charAt(0));
		
		scanner.close();
	}
	
}
