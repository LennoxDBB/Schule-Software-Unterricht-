import java.util.Random;
import java.util.Scanner;

public class Kniffel {
	
	private static void throwDices(int[] dices) {
		Random random = new Random();
		
		for(int i = 0; i < dices.length; i++) {
			if(dices[i] == -1) continue;
			dices[i] = random.nextInt(1, 7);
		}
	}
	
	private static void drawDices(int[][] draw, int[] dices, int[] saved) {
		
		for(int i = 0; i < draw.length; i++) {
			for(int j = 0; j < draw[i].length; j++) {
				draw[i][j] = 0;
			}
		}
		
		throwDices(dices);
		
		for(int i = 0; i < dices.length; i++) {
			int number = dices[i];
			if(number == -1) number = saved[i];
			
			switch(number) {
			case 1:
				draw[4][4 + i * 10] = 1;
				break;
			case 2:
				draw[2][6 + i * 10] = 1;
				draw[6][2 + i * 10] = 1;
				break;
			case 3:
				draw[2][6 + i * 10] = 1;
				draw[4][4 + i * 10] = 1;
				draw[6][2 + i * 10] = 1;
				break;
			case 4:
				draw[2][2 + i * 10] = 1;
				draw[2][6 + i * 10] = 1;
				draw[6][2 + i * 10] = 1;
				draw[6][6 + i * 10] = 1;
				break;
			case 5:
				draw[2][2 + i * 10] = 1;
				draw[2][6 + i * 10] = 1;
				draw[4][4 + i * 10] = 1;
				draw[6][2 + i * 10] = 1;
				draw[6][6 + i * 10] = 1;
				break;
			case 6:
				draw[2][2 + i * 10] = 1;
				draw[2][6 + i * 10] = 1;
				draw[4][2 + i * 10] = 1;
				draw[4][6 + i * 10] = 1;
				draw[6][2 + i * 10] = 1;
				draw[6][6 + i * 10] = 1;
				break;
			}
		}
		
		for(int i = 0; i < draw.length; i++) {
			for(int j = 0; j < draw[i].length; j++) {
				
				if(i == 0 || i == 8) {
					if(j % 10 != 9) {
						draw[i][j] = 1;
					} 
				} else {
					if(j % 10 == 0 || j % 10 == 8) {
						draw[i][j] = 1;
					}
					
				}
					
				if(draw[i][j] == 1) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}

		System.out.println("");
	}
	
	private static Boolean isNotSaved(int[] saved) {
		for(int i = 0; i < saved.length; i++) {
			if(saved[i] == 0) {
				return true;
			}
		}
		return false;
	}
	
	private static Boolean isDiceSaved(int[] dices, int index) {
		if(dices[index] == -1) {
			return true;
		}
		return false;
	}
	
	private static Integer getFrequency(int[] array, int number) {
		int amount = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != number) continue;
			amount++;
		}
		
		return amount;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		int attempt = 0;
		
		int[][] drawDice = new int[9][49];
		int[] diceCup = new int[5];
		int[] diceSave = new int[5];

		System.out.println("<<< Kniffel | Bekommst du alle 5 >>>");
		System.out.println("------------------------------------\n");
		System.out.println("Versuche innerhalb von drei Würfen,");
		System.out.println("möglichst viele Würfel einer Zahl");
		System.out.println("zu sammeln. Du kannst nach jedem");
		System.out.println("Wurf entscheiden, ob du Würfel");
		System.out.println("behalten oder neu werfen möchtest.\n");
		
		while(isNotSaved(diceSave) && attempt < 3) {
			if(attempt == 0) {
				drawDices(drawDice, diceCup, diceSave);
				attempt += 1;
			}
			System.out.println("Was möchtest du tun?");
			System.out.println("----------------------");
			System.out.println("");
			System.out.println("0 | Werfen");
			for(int i = 1; i <= diceCup.length; i++) {
				String s = isDiceSaved(diceCup, i - 1) ? " freigeben" : " sichern";
				System.out.println(i + " | Würfel " + i + s);
			}
			System.out.print(">> ");
			int input = scanner.nextInt();
			System.out.println();
			
			if(input == 0) {
				drawDices(drawDice, diceCup, diceSave);
				attempt += 1;
			} else if(input >= 1 && input <= 5) {
				if(attempt == 0) continue;
				input -= 1;
				if(isDiceSaved(diceCup, input)) {
					diceCup[input] = diceSave[input];
					diceSave[input] = 0;
				} else {
					diceSave[input] = diceCup[input];
					diceCup[input] = -1;
				}
			} else {
				System.out.println("\nKeine gültige Zahl!\n");
			}
		}
		
		for(int i = 0; i < diceCup.length; i++) {
			if(diceCup[i] == -1) continue;
			diceSave[i] = diceCup[i];
		}
		
		System.out.println("\n-----------------------------------------\n");
		
		for(int i = 0; i < 6; i++) {
			System.out.println((i + 1) + " | " + getFrequency(diceSave, i + 1) + "mal");
		}
		
		scanner.close();
	}
}
	
