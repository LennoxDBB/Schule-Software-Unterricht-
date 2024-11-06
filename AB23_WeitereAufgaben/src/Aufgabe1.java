import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		/*
		 * Schaltjahr nur wenn /4
		 * 
		 * Check if:
		 * - /400 schaltjahr
		 * - /100 kein schaltjahr
		 * - /4 schaltjahr
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Geben Sie eine Jahreszahl an \n>> ");
		int year = scanner.nextInt();
		
		if(year <= 0) {
			System.out.println("\nFehler! Die Jahreszahl muss größer als 0 sein!");
			scanner.close();
			return;
		}
		
		if(year % 400 == 0) {
			System.out.println("\nDieses Jahr ist ein Schaltjahr!");
		} else if(year % 100 == 0) {
			System.out.println("\nDieses Jahr ist kein Schaltjahr!");
		} else if(year % 4 == 0) {
			System.out.println("\nDieses Jahr ist ein Schaltjahr!");
		} else {
			System.out.println("\nDieses Jahr ist kein Schaltjahr!");
		}
		
			
		scanner.close();
	}
	
}
