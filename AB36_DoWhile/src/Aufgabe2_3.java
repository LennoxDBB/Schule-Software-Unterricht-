import java.util.Scanner;

public class Aufgabe2_3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int numbers = 0;
		
		System.out.println("Bitte geben Sie Zahlen an!");
		do {
			int eingabe = scanner.nextInt();
			sum += eingabe;
			numbers++;
		} while(sum < 100);
		scanner.close();
		
		System.out.println("Es wurden " + numbers + " Zahlen miteinander addiert!");
		
		
	}
	
}
