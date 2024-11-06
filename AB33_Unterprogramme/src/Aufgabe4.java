import java.util.Scanner;

public class Aufgabe4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine positive Ganzzahl an: ");
		int num = scanner.nextInt();
		
		System.out.println(berechneFakultaet(num));
		
		scanner.close();
		
	}
	
	static int berechneFakultaet(int n) {
		int factor = 1;
		for(int i = n; i > 0; i--) {
			factor *= i;
		}
		
		return factor;
	}
	
}
