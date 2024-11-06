import java.util.Random;
import java.util.Scanner;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		int number = random.nextInt(1, 100 + 1);
		
		int currentGuess = 0; 
		int guesses = 0;
		
		while(currentGuess != number) {
			System.out.print("Geben Sie eine Zahl an \n>> ");
			currentGuess = scanner.nextInt();
			
			if(currentGuess < 1 || currentGuess > 100) {
				System.out.println("\nDie Zahl muss zwischen 1 und 100 liegen!\n");
				continue;
			}
			
			guesses += 1;
			if(currentGuess < number) {
				System.out.println("\nDie gesuchte Zahl ist größer als " + currentGuess + " [Versuch: " + guesses + "]");
			} else if(currentGuess > number) {
				System.out.println("\nDie gesuchte Zahl ist kleiner als " + currentGuess + " [Versuch: " + guesses + "]");
			} else {
				System.out.println("\n-----------------------------------------");
				System.out.println("\nDu hast die Zahl erraten!");
				System.out.println("\nDie Zahl war: " + number);
				System.out.println("Benötigte Versuche: " + guesses);
				break;
			}
			
		}
		
		scanner.close();
		
	}
	
}
