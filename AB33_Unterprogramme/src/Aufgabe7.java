public class Aufgabe7 {
	
	public static void main(String[] args) {
		
		printRechteck('+', 99, 52);
		
	}
	
	static void printRechteck(char symbol, int columns, int lines) {
		
		int[][] draw = new int[lines][columns];
		
		
		for(int i = 0; i < draw.length; i++) {
			for(int j = 0; j < draw[i].length; j++) {
				if(i == 0 || i == draw.length - 1 || j == 0 || j == draw[i].length - 1) {
					System.out.print("# ");
				} else {
					System.out.print(symbol + " ");
				}
			}
			System.out.println();
		}
	
	}		
	
}
