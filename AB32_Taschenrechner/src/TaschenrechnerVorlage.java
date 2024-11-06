import java.util.Scanner;

public class TaschenrechnerVorlage {
	
	public static void main(String[] args) {

		String auswahl;
		int zahl1, zahl2, ergebnis = 0;
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("TASCHENRECHNER");
		System.out.println("Geben Sie eine Zahl ein: ");
		zahl1 = eingabe.nextInt();
		System.out.println("Geben Sie eine weitere Zahl ein: ");
		zahl2 = eingabe.nextInt();
		System.out.println("\nWählen Sie eine Grundrechenart aus:\n");
		System.out.println("1: Addition");
		System.out.println("2: Subtraktion");
		System.out.println("3: Multiplikation");
		System.out.println("4: Division");
		auswahl = eingabe.next();
		
		switch (auswahl) {

		case "1":
		case "A":
		case "a":
		case "+":
			ergebnis = add(zahl1, zahl2);
			break;
			
		case "2":
		case "S":
		case "s":
		case "-":
			ergebnis = sub(zahl1, zahl2);
			break;
			
		case "3":
		case "M":
		case "m":
		case "*":
			ergebnis = mul(zahl1, zahl2);
			break;
			
		case "4":
		case "D":
		case "d":
		case "/":
			ergebnis = div(zahl1, zahl2);
			break;
			
		}
		
		System.out.println("\nErgebnis: " + ergebnis);

		eingabe.close();
		
	}
	
	static int add(int p_number1, int p_number2)
	{
		int summe;
		summe = p_number1 + p_number2;
		return summe;
	}
	
	static int sub(int p_number1, int p_number2)
	{
		int differenz;
		differenz = p_number1 - p_number2;
		return differenz;
	}

	static int mul(int p_number1, int p_number2)
	{
		int produkt;
		produkt = p_number1 * p_number2;
		return produkt;
	}

	static int div(int p_number1, int p_number2)
	{
		int quotient;
		quotient = p_number1 / p_number2;
		return quotient;
	}
	
}
