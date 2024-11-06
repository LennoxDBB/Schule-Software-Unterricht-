import java.text.DecimalFormat;
import java.util.Scanner;

public class AB13_OnlineVersandhandel {
	
	public static void main(String[] args) {
		
		String formatPattern = "###,###.##";
		DecimalFormat df = new DecimalFormat(formatPattern);
		
		String s = "Der Stückpreis beträgt: ";
		String full = "Der Gesamtpreis beträgt: ";
		
		float price = 3.12f;
		float price2 = 2.81f;
		float price3 = 2.54f;
		float price4 = 2.28f;
		
		int step2 = 10;
		int step3 = 25;
		int step4 = 50;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Ihre Bestellmenge an:");
		int amount = scanner.nextInt();
		
		scanner.close();
		
		if(amount <= 0) {
			System.out.println("Sie müssen mindestens 1 Relais bestellen!");
		} else if(amount < step2) {
			System.out.println(s + price + "€");
			System.out.println(full + amount + " x " + price + " = " + df.format(price * amount) + "€");
		} else if(amount < step3) {
			System.out.println(s + price2 + "€");
			System.out.println(full + amount + " x " + price2 + " = " + df.format(price2 * amount) + "€");
		} else if(amount < step4) {
			System.out.println(s + price3 + "€");
			System.out.println(full + amount + " x " + price3 + " = " +  df.format(price3 * amount) + "€");
		} else {
			System.out.println(s + price4 + "€");
			System.out.println(full + amount + " x " + price4 + " = " +  df.format(price4 * amount) + "€");
		}
		
	}
	
}
