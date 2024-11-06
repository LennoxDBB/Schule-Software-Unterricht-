import java.util.Scanner;

public class Aufgabe2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] numbers = new int[2][3];
		char[][] letters = new char[3][2];
		double[][] doubles = new double[3][3];
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print("Bitte geben Sie eine Ganzzahl für Feld (" + i + " | " + j + ") ein \n>> ");
				numbers[i][j] = scanner.nextInt();
				System.out.println();
			}
		}
		
		for(int i = 0; i < letters.length; i++) {
			for(int j = 0; j < letters[i].length; j++) {
				System.out.print("Bitte geben Sie einen Buchstaben für Feld (" + i + " | " + j + ") ein \n>> ");
				letters[i][j] = scanner.next().charAt(0);
				System.out.println();
			} 
		}
		
		for(int i = 0; i < doubles.length; i++) {
			for(int j = 0; j < doubles[i].length; j++) {
				System.out.print("Bitte geben Sie eine Kommazahl für Feld (" + i + " | " + j + ") ein \n>> ");
				doubles[i][j] = scanner.nextDouble();
				System.out.println();
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
		for(int i = 0; i < letters.length; i++) {
			for(int j = 0; j < letters[i].length; j++) {
				System.out.println(letters[i][j]);
			} 
		}
		
		for(int i = 0; i < doubles.length; i++) {
			for(int j = 0; j < doubles[i].length; j++) {
				System.out.println(doubles[i][j]);
			}
		}
		
		
		
		
		scanner.close();
		
	}
	
}
