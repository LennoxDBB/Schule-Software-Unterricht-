import java.util.Scanner;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int numbers = 0;
		
		System.out.println("Bitte geben Sie Zahlen an!");
		while(sum < 100) {
			int eingabe = scanner.nextInt();
			sum += eingabe;
			numbers++;
		}
		scanner.close();
		
		System.out.println("Es wurden " + numbers + " Zahlen miteinander addiert!");
		
		
	}
	
}
