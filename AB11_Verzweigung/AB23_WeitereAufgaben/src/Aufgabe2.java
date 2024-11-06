import java.util.Scanner;

public class Aufgabe2 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie eine positive Ganzzahl an \n>> ");
		int number = scanner.nextInt();
		
		if(number < 0) {
			System.out.println("Die Zahl muss größer als 0 sein");
			scanner.close();
			return;
		}
		
		System.out.println(Integer.toBinaryString(number));
		scanner.close();
	}
	
}
