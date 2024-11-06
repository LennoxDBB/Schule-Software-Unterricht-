import java.text.DecimalFormat;
import java.util.Scanner;

public class AB24_Noten {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.0");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*****************************************************");
		System.out.println("* Dieses Programm berechnet einen Notendurschnitt.  *");
		System.out.println("* Bitte geben Sie die Noten nacheinander ein.       *");
		System.out.println("*****************************************************");
		
		System.out.print("\nBitte geben Sie die Schüleranzahl an \n>> ");
		int students = scanner.nextInt();
		
		if(students <= 0) {
			System.out.println("\nFehler! Die Anzahl der Schüler muss positiv sein!");
			scanner.close();
			return;
		}
		
		double[] grades = new double[students];
		
		double sum = 0;
		String fail = "";
		
		for(int i = 0; i < grades.length; i++) {
			System.out.print("Bitte geben Sie die " + (i + 1) + "." + " Note" + fail + " ein \n>> ");
			double grade = scanner.nextDouble();
			
			if(grade < 1.0 || grade > 6.0) {
				System.out.println("\nDie Note muss zwischen 1.0 und 6.0 liegen! \n");
				fail = " erneut";
				i--;
				continue;
			} 
			
			sum += grade;
			fail = "";
			grades[i] = grade;
			
		}
		
		double average = sum / students;
		
		System.out.println(" ");
		System.out.println("*************************************");
		System.out.println("* Notendurschnitt:              " + df.format(average) + " *");
		System.out.println("*************************************");
		scanner.close();
	}
	
}
