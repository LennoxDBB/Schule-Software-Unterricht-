import java.text.DecimalFormat;
import java.util.Scanner;

public class Aufgabe4 {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###");
		Scanner scanner = new Scanner(System.in);
		
		String loop = "";
		
		System.out.print("Bitte geben Sie eine Zahl an\n>> ");
		int number = scanner.nextInt();
		
		if(number < 0) {
			System.out.print("\nBitte geben Sie eine positive Ganzzahl an!");
			scanner.close();
		} else if(number > 20) {
			System.out.print("\nIhre Zahl darf nicht größer als 20 sein!");
			scanner.close();
		} else {
			System.out.print("While- oder For-Schleife? - Tippen Sie entweder 'while' oder 'for'\n>> ");
			loop = scanner.next();
			scanner.close();
		}
		
		long result = 1;
		if(loop.toUpperCase().equals("WHILE")) {
			int counter = 1;
			while(counter <= number) {
				result *= counter;
				counter++;
			}
			System.out.println("\n" + number + "! = " + df.format(result));
		} else if(loop.toUpperCase().equals("FOR")) {
			for(int i = 1; i <= number; i++) {
				result *= i;
			}
			System.out.println("\n" + number + "! = " + df.format(result));
		} else {
			System.out.println("\nEs wurde abgebrochen!");
		}
		
	}
	
}
