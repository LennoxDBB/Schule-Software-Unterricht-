import java.util.Scanner;

public class Aufgabe6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine X-Koordinate an: ");
		double x = scanner.nextDouble();
		
		System.out.println("Bitte geben Sie eine Y-Koordinate an: ");
		double y = scanner.nextDouble();
		
		System.out.println("\nIhr Punkt (" + x + "|" + y + ") befeindet sich hier: " + bestimmeQuadrant(x, y));
		
		scanner.close();
		
	}
	
	static String bestimmeQuadrant(double x, double y) {
			
		if(x > 0 && y > 0) {
			return "I. Quadrant";
		} else if(x < 0 && y > 0) {
			return "II. Quadrant";
		} else if(x < 0 && y < 0) {
			return "III. Quadrant";
		} else if(x > 0 && y < 0) {
			return "IV. Quadrant";
		} else if(x != 0 && y == 0) {
			return "X-Achse";
		} else if(x == 0 && y != 0) {
			return "Y-Achse";
		}
		
		return "Origo = (0|0)";
	}
	
}
