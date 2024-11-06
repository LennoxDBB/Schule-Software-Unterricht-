import java.util.Scanner;

public class Aufgabe2b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Länge des Rechtecks an:");
		double a = scanner.nextDouble();
		
		System.out.println("Bitte geben Sie die Breite des Rechtecks an:");
		double b = scanner.nextDouble();
		
		double area = a * b;
		
		System.out.println("");
		System.out.println("Länge: " + a);
		System.out.println("Breite: " + b);
		System.out.println("Flächeninhalt: " + area);
		
		scanner.close();
	}
	
}
