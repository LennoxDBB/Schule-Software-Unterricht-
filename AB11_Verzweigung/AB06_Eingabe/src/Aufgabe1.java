import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die erste Ganzzahl an:");
		int a = scanner.nextInt();
		
		System.out.println("Bitte geben Sie die zweite Ganzzahl an:");
		int b = scanner.nextInt();
		
		System.out.println("");
		System.out.println(a + " + " + b + " = " + String.valueOf(a + b));
		System.out.println(a + " - " + b + " = " + String.valueOf(a - b));
		System.out.println(a + " * " + b + " = " + a * b);
		System.out.print(a + " / " + b + " = " + a / b);
		
		scanner.close();
	}

}
