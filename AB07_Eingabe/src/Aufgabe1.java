import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie den ersten Durchmesser an (in cm):");
		double d1 = scanner.nextDouble();
		
		System.out.println("Bitte geben Sie den zweiten Durchmesser an (in cm):");
		double d2 = scanner.nextDouble();
		
		System.out.println("");
		System.out.println("d1 = " + d1 + "cm");
		System.out.println("d2 = " + d2 + "cm");
		System.out.println("A = " + Math.abs((Math.PI / 4) * (Math.pow(d1, 2.0) - Math.pow(d2, 2.0))) + "cm²");
		
		scanner.close();
		
	}
	
}
