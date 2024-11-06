import java.util.Scanner;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie eine Zahl an\n>> ");
		int number = scanner.nextInt();
		int lines = number;
		scanner.close();
		
		for(int i = 0; i <= lines; i++) {
			for(int j = number; j >= 0; j--) {
				System.out.print(j + "   ");
			}
			System.out.println("");
			number -= 1;
		}
		
	}
	
}
