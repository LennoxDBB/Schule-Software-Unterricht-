import java.util.Scanner;

public class AB22_ForSchleifeZusatz {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Bitte geben Sie die erste positive Ganzzahl an \n>> ");
		int number1 = scanner.nextInt();
		
		System.out.print("Bitte geben Sie die zweite positive Ganzzahl an \n>> ");
		int number2 = scanner.nextInt();
		
		if(number1 <= 0 || number2 <= 0) {
			System.out.println("\nFehler! Die Zahl muss größer als 0 sein");
			scanner.close();
			return;
		}
		
		System.out.println("\nZahl 1: " + number1);
		System.out.println("Zahl 2: " + number2);
		
		String line = "\n------------------------------------------\n";
		
		System.out.println(line);
		for(int lines = 0; lines < number1; lines++) {
			for(int columns = 0; columns < number2; columns++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println(line);
		for(int lines = 0; lines < number2; lines++) {
			for(int columns = 0; columns < number1; columns++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println(line);
		for(int lines = 0; lines <= number1; lines++) {
			for(int j = 0; j < lines; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println(line);
		for(int lines = 0; lines < number2; lines++) {
			for(int j = number1 - lines; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		scanner.close();
	}
	
}
