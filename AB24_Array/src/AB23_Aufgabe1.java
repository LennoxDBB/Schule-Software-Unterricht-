import java.text.DecimalFormat;
import java.util.Scanner;

public class AB23_Aufgabe1 {
	
	public static void main(String[] args) {
		//Aufgabe 1a | Texte, Zahlen und Objekte
		
		//Aufgabe 1b, 1c
		
		DecimalFormat df = new DecimalFormat("#.0");
		Scanner scanner = new Scanner(System.in);
				
		double[] grades = new double[0];
		double sum = 0;
		
		System.out.println("*************************************************************************************");
		System.out.println("* Dieses Programm berechnet den Notendurchschnitt für die Klasse TGE.2 im Fach ITs. *");
		System.out.println("* Bitte geben Sie die Noten der SuS ein.                                            *");
		System.out.println("*************************************************************************************\n");
		
		System.out.print("Bitte geben Sie die Anzahl der SuS an:\n>> ");
		int amount = scanner.nextInt();
		
		if(amount <= 0) {
			System.out.println("\nFehler! Die Anzahl an SuS muss mindestens 1 betragen! Bitte neustarten!");
			scanner.close();
		} else {
			grades = new double[amount];
		}
		
		String failed = "";
		
		for(int i = 0; i < grades.length; i++) {
			System.out.print("Bitte geben Sie die " + (i + 1) + ". Note" + failed + " ein:\n>> ");
			failed = "";
			double grade = scanner.nextDouble();
			if(grade >= 1 && grade <= 6) {
				grades[i] = grade;
				sum += grade;
			} else {
				failed = " erneut";
				System.out.println("\nDie Note muss zwischen 1.0 und 6.0 liegen!\n");
				i--;
			}
			
			if(i == grades.length - 1) {
				System.out.println("\n*****************************************");
				System.out.println("* Der Notendurchschnitt entspricht: " + df.format(sum / grades.length) + " *");
				System.out.println("*****************************************");
			}
		}
		
		
		
	}
	
}