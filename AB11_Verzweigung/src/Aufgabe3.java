import java.util.Scanner;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Ihr Alter an:");
		int age = scanner.nextInt();
		
		if(age <= 15) {
			System.out.println("Kein Bier oder Schnaps ausgeben!");
		} else if(age <= 17) {
			System.out.println("Keinen Schnaps ausgeben!");
		} else {
			System.out.println("Nur weil du volljährig bist, musst du dich nicht gleich betrinken!");
		}
		
		scanner.close();
	}
	
}
