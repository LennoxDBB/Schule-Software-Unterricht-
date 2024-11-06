import java.text.DecimalFormat;

public class Aufgabe2 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		int[] numbers = {31, 35, 64, 92, 7, 1, 85, 10, 12, 9, 537, 43};
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
		
			sum += numbers[i];
			
		}
		
		double average = sum / numbers.length;
		
		System.out.println("Die Summe aller Zahlen im Array ergeben: " + df.format(sum));
		System.out.println("Das Arithmetische Mittel der Zahlen ist: " + df.format(sum / numbers.length));
		
		System.out.println("\nFolgende Zahlen liegen über dem Mittelwert: ");
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > average) {
				System.out.println(numbers[i] + " | Ja");
			} else {
				System.out.println(numbers[i] + " | Nein");
			}
		}
		
	}
	
}
