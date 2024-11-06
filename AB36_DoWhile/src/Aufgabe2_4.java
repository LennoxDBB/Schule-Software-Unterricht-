import java.text.DecimalFormat;
import java.util.Scanner;

public class Aufgabe2_4 {

	public static void main(String[] args) {

		String pattern = ",###.00";
		DecimalFormat df = new DecimalFormat(pattern);

		Scanner scanner = new Scanner(System.in);

		int sparbuch = 1000000;
		int jahre = 0;

		System.out.println("Bitte geben Sie den jährlichen Zinssatz an (in %):");
		float zinssatz = scanner.nextFloat();

		System.out.println("Bitte geben Sie Ihre jährliche Auszahlung an (in €):");
		float gehalt = scanner.nextFloat();

		scanner.close();
		System.out.println("");

		do {
			jahre++;
			sparbuch *= 1 + (zinssatz / 100f);
			sparbuch -= gehalt;
			if (sparbuch > 0) {
				System.out.println("Jahr " + jahre + " | " + df.format(sparbuch) + "€");
			} else {
				System.out.println("Jahr " + jahre + " | 0,00€");
				System.out.println("");
				System.out.println("Sie hatten nicht mehr genug Geld auf Ihrem Sparbuch! \nIhnen wurden die restlichen "
						+ df.format(gehalt + sparbuch) + "€ ausgezahlt!");
			}
		} while(sparbuch > 0 && jahre < 100);

	}

}
