import java.text.DecimalFormat;
import java.util.Scanner;

public class Aufgabe2c {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie eine Startzahl an\n>> ");
		int number = scanner.nextInt();
		scanner.close();
		
		if(number < 0) {
			System.out.print("\nBitte geben Sie eine positive Ganzzahl an!");
		}
		
		if(number % 2 == 1) number--;
		
		System.out.println("");
		for(int i = number; i > 0; i-=2) {
			System.out.print(df.format(i));
			if(i > 2) System.out.print(", ");
		}
		
	}
	
}
