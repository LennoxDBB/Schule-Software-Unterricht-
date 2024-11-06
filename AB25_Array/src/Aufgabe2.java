import java.text.DecimalFormat;

public class Aufgabe2 {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat(",###.00");
		
		int[] array = {10, 679, 96, 70, 420, 200, 2023, 2207, 1897, 34};
		
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("Summe der Zahlen: " + df.format(sum));
		System.out.println("Mittelwert Zahlen: " + df.format(sum / array.length));
	}
	
}
