import java.text.DecimalFormat;
import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie an, bis wohin Sie alle Zahlen addieren wollen\n>> ");
		int number = scanner.nextInt();
		scanner.close();
		
		int result = 0;
		
		if(number < 0) {
			System.out.println("\nBitte geben Sie eine positive Ganzzahl an!");
		}
		
		for(int i = 0; i <= number; i++) {
			result += i;
		}
		System.out.println("\nSie haben die Zahlen von 0 bis " + df.format(number) + " addiert!\nIhr Endergebnis ist: " + df.format(result));
		
	}
	
}
