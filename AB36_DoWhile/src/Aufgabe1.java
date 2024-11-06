import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		int pinOriginal = 1234, pukOriginal = 5712, fails = 0, pin, puk;
		
		Scanner scanner = new Scanner(System.in);
				
		do {	
			System.out.print("Bitte geben Sie die PIN ein\n>> ");
			pin = scanner.nextInt();
			
			if(pin < 1000 || pin > 9999) {
				System.out.println("\nDie PIN war nicht vierstellig! Bitte geben Sie sei erneut ein!");
				continue;
			}
			
			fails++;
			if(fails == 3) {
				System.out.println("\nSie haben die PIN dreimal falsch eingegeben!");
				
				do {
					System.out.print("Bitte geben Sie Ihren PUK ein\n>> ");
					puk = scanner.nextInt();
				} while(pukOriginal != puk);
				break;
			}
		} while(pinOriginal != pin);
		
		System.out.println("\nSie sind angemeldet!");
		scanner.close();
	}
	
}