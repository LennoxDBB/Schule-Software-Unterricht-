import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		ausgehen();
		
	}
	
	
	static void ausgehen() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine Zahl an:");
		int input = scanner.nextInt();
		
		if(input == 1) {
			System.out.println("Lass uns in den Englischen Garten gehen.");
		} else {
			System.out.println("Oh, jeh, es regnet, lass uns zu Hause Karten spielen.");
		}
		
		scanner.close();
	}
	
}
