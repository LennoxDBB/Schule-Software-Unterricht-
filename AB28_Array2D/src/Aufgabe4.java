public class Aufgabe4 {
	
	public static void main(String[] args) {
		
		//00 10 20     01 11 21     02 12 22     03 13 23
		
		int[][] a = {{4, 0, 2, 44}, {3, 20, 33, -4}, {12, -30, 6, 110}};
		int[] lineSum = new int[a.length];
		int[] columnSum = new int[a[0].length];
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				
				lineSum[i] += a[i][j];
				sum += a[i][j];
				columnSum[j] += a[i][j];
				
			}
		}
		
		System.out.println("Summe Gesamt  | " + sum);
		
		for(int i = 0; i < lineSum.length; i++) {
			System.out.println("Summe Zeile" + i + "  | " + lineSum[i]);
		}
		
		for(int i = 0; i < columnSum.length; i++) {
			System.out.println("Summe Spalte" + i + " | " + columnSum[i]);
		}
		
	}
	
}
