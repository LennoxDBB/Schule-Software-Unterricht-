import java.text.DecimalFormat;

public class Aufgabe5 {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat(",###.00");
		
		int[][] tabelle = {{1001, 5, 500, 0}, {2001, 23, 1200, 0}, {3001, 2, 85, 0}};
		
		for(int i = 0; i < tabelle.length; i++) {
			System.out.println(tabelle[i][1] + "x Artikel Nr. " + tabelle[i][0] + " à " + tabelle[i][2] + " EUR = 0,00");
		}
		
		for(int i = 0; i < tabelle.length; i++) {
			int price = tabelle[i][1] * tabelle[i][2];
			System.out.println(tabelle[i][1] + "x Artikel Nr. " + tabelle[i][0] + " à " + tabelle[i][2] + " EUR = " + df.format(price));
		}
	}
	
}
