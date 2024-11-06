import java.util.Random;

public class AB26_Kniffel {
	
	public static void main(String[] args) {
		
		/*
		 * 5 Würfel (Zahlen)
		 * 3 mal kann man Würfeln und beliebige Zahlen behalten
		 * Becher (Array)
		 * Save (Array)
		 * 
		 * Würfel zeichnen
		 * 
		 * '\u25A0'   Viereck
		 * 
		 * 
		 * 
		 * 
		 */
		
		Random random = new Random();
		
		char b = '#';
		
		for(int i = 0; i < 9; i++) {
			int[] array = new int[50];
			for(int j = 0; j < 50; j++) {
				if(j % 10 == 0) {
					array[j] = 0;
				} else {
					if(i == 0 || i == 8) {
						array[j] = 1;
					}
				}
			}
			System.out.println("");
		}
		
	}
	
}
