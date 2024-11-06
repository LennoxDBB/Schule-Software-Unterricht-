import java.util.Scanner;

public class Taschenrechner {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine Zahl a an:");
		double num1 = scanner.nextDouble();
		
		System.out.println("Bitte geben Sie eine Zahl b an:");
		double num2 = scanner.nextDouble();
		
		System.out.println("\nWählen Sie Ihre Grundrechenart aus: \n"
						 + "1. Addition\n"
						 + "2. Subtraktion\n"
						 + "3. Multiplikation\n"
						 + "4. Division");
		
		double result = 0;
		
		switch(scanner.nextInt()) {
		case 1:
			result = add(num1, num2);
			break;
		case 2:
			result = sub(num1, num2);
			break;
		case 3:
			result = mult(num1, num2);
			break;
		case 4:
			result = div(num1, num2);
			break;
		default:
			System.out.println("Fehler! Diese Auswahl gibt es nicht!");
			scanner.close();
			return;
		}
		
		System.out.println("\nDas Ergebnis lautet: " + result);
		
		scanner.close();
		
	}
	
	static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	static double sub(double num1, double num2) {
		return num1 - num2;
	}
	
	static double mult(double num1, double num2) {
		return num1 * num2;
	}
	
	static double div(double num1, double num2) {
		return num1 / num2;
	}
	
}
