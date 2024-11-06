import java.util.Scanner;

public class Aufgabe2a {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Länge des Rechtecks an:");
		int a = scanner.nextInt();
		
		System.out.println("Bitte geben Sie die Breite des Rechtecks an:");
		int b = scanner.nextInt();
		
		int area = a * b;
		
		System.out.println("");
		System.out.println("Länge: " + a);
		System.out.println("Breite: " + b);
		System.out.println("Flächeninhalt: " + area);
		
		scanner.close();
		
	}
	
}
