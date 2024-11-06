import java.util.Scanner;

public class Aufgabe2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Spannungswert an (in V):");
		double spannung = scanner.nextDouble();
		while(spannung < 14.9 || spannung > 15.1) {
			System.out.println("Der Spannungswert " + spannung + "V liegt nicht im gültigen Bereich!");
			spannung = scanner.nextDouble();
		}
		System.out.println("Der Spannungswert " + spannung + "V liegt im gültigen Bereich!");
		scanner.close();
	}
	
}
