import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Ihr Alter ein:");
		int age = scanner.nextInt();
		
		System.out.println("");
		
		if(age >= 18) {
			System.out.println("Volljährig");
		} else {
			System.out.println("Nicht Volljährig");
		}
		
		scanner.close();
	}
}
