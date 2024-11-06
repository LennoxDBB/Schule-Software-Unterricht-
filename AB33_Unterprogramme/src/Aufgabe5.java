import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine Temperatur an: ");
		double temp = scanner.nextDouble();
		
		System.out.println("Bitte geben Sie die Einheit an (Celsius oder Kelvin): ");
		String s = scanner.next();
		
		if(temp < 0 && s.equalsIgnoreCase("kelvin") || temp < -273.15 && s.equalsIgnoreCase("celsius")) {
			System.out.println("Fehler! Absoluten Nullpunkt überschritten!");
			scanner.close();
			return;
		}
		
		if(s.equalsIgnoreCase("Celsius")) {
			System.out.println(temp + " °C entsprechen " + celsiusToKelvin(temp) + " K");
		} else if(s.equalsIgnoreCase("Kelvin")) {
			System.out.println(temp + " K entsprechen " + kelvinToCelsius(temp) + " °C");
		} else {
			System.out.println("\nFehler! Falsche Einheit!");
			scanner.close();
			return;
		}
		
		scanner.close();
	}
	
	static double celsiusToKelvin(double tempC) {
		
		return tempC + 273.15;
		
	}
	
	static double kelvinToCelsius(double tempK) {
		
		return tempK - 273.15;
		
	}
}
