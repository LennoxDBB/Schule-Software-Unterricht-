import java.text.DecimalFormat;
import java.util.Scanner;

public class Aufgabe2b {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie eine Maximalzahl an\n>> ");
		int number = scanner.nextInt();
		scanner.close();
		
		if(number < 0) {
			System.out.println("\nBitte geben Sei eine positive Ganzzahl an!");
		}
		
		System.out.println("");
		for(int i = 0; i <= number; i++) {
			System.out.print(df.format(i));
			if(i != number) System.out.print(", ");
		}
	}
	
}
