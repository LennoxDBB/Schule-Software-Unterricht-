import java.util.Scanner;

public class Aufgabe2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Ihre Raumtemperatur an (in °C):");
		int temp = scanner.nextInt();
		
		if(temp < 20) {
			System.out.println("Die Heizung heizt nun!");
		} else {
			System.out.println("Die Heizung heizt nicht mehr!");
		}
		
		scanner.close();
		
	}
	
}
