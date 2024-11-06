import java.text.DecimalFormat;

public class SchachKörnerIrgendwas {
	
	public static void main(String[] args) {
		
		/*
		 * Schachfeld 8x8
		 * Jedes Feld Korn verdoppel (2^n)
		 * Zwischen
		 * Gesamt
		 */
		DecimalFormat df = new DecimalFormat(",###");
		
		double save = 1;
		double weight = 0.05;
		for(int i = 0; i < 64; i++) {
			save += Math.pow(2, i);
			System.out.println("Feld " + (i + 1) + " | " + df.format(Math.pow(2, i)));
		}
		
		double result = save * weight;
		System.out.println("\nEs liegen insgesamt " + df.format(save) + " Körner");
		System.out.println("\nAlle Körner wiegen zusammen: \n" + df.format(result) + " g   oder");
		System.out.println(df.format(result / 1000) + " kg      oder");
		System.out.println(df.format(result / 1000000) + " t");
		
	}
	
}