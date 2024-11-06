import java.util.Scanner;

public class Aufgabe4 {
	
	private static boolean isAlphabetic(String string) {
		
		char[] chars = string.toCharArray();
		
		if(new String().matches(string))
		
		for(int i = 0; i < chars.length; i++) {
			if(!Character.isLetter(chars[i])) {
				return false;
			}
		}
		
		return true;
	}
	
	private static String checkGuessedLetter(String word, String solution, char letter) {
		
		char[] chars = word.toCharArray();
		String solutionNew = "";
		
		for(int i = 0; i < chars.length; i++) {
			if(solution.charAt(i * 2) != '_') {
				solutionNew += solution.charAt(i * 2) + " ";
				continue;
			}
			
			if(chars[i] == letter) {
				solutionNew += letter + " ";
			} else {
				solutionNew += "_ ";
			}
		}
		
		return solutionNew;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		int failsMax = 26;
//		
//		System.out.print("Bitte geben Sie den Schwierigkeitsgrad an\n"
//				+ "Einfach - Maximale Fehler: 15 - 1/E/e\n"
//				+ "Mittel  - Maximale Fehler: 10 - 2/M/m\n"
//				+ "Schwer  - Maximale Fehler:  5 - 3/S/s\n >>");
//		
//		switch(scanner.next()) {
//		case "1":
//		case "E":
//		case "e":
//			failsMax = 15;
//			break;
//		case "2":
//		case "M":
//		case "m":
//			failsMax = 10;
//			break;
//		case "3":
//		case "S":
//		case "s":
//			failsMax = 5;
//			break;
//		default:
//			System.out.println("\nFehler! Ungültige Eingabe!");
//			System.exit(0);
//		}
		
		System.out.print("Bitte geben Sie das zu suchende Wort an (nur Buchstaben) \n>> ");
		String word = scanner.next().toUpperCase();
		
		if(!isAlphabetic(word) || word.contains("Ä") || word.contains("Ü") || word.contains("Ö")) {
			System.out.println("\nFehler! Ungültiges Wort! Das Wort darf nur Buchstaben enthalten! (ohne Umlaute)");
			System.exit(0);
		}
		
		boolean isWordGuessed = false;
		String solution = "";
		int fails = 0;
		char[] alreadyGuessed = new char[26];

		for(int i = 0; i < word.length(); i++) {
			solution += "_ ";
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		
		GAME:
		while(!isWordGuessed) {
			
			System.out.println("\nWort: " + solution);
			System.out.println("Fehler: " + fails);
			System.out.print("\nWelchen Buchstaben möchtest du raten?\n>> ");
			char guessedLetter = scanner.next().toUpperCase().charAt(0);
			
			if(!isAlphabetic(String.valueOf(guessedLetter))) {
				System.out.println("\nFehler! Kein gültiger Buchstabe!");
				continue;
			}
			
			for(int i = 0; i < alreadyGuessed.length; i++) {
				if(alreadyGuessed[i] == guessedLetter) {
					System.out.println("\nDer Buchstabe '" + guessedLetter + "' wurde bereits geraten!\n");
					continue GAME;
				} else if(alreadyGuessed[i] != '\u0000') {
					continue;
				} else {
					alreadyGuessed[i] = guessedLetter;
					break;
				}
			}
			
			if(!word.contains(String.valueOf(guessedLetter))) fails++;
			
			solution = checkGuessedLetter(word, solution, guessedLetter);
			if(!solution.contains("_")) break;
		}
		
		System.out.println("\n\n\nDas Wort wurde erraten!");
		System.out.println("Das Wort war: " + word);
		System.out.println("Fehler: " + fails);
				
		scanner.close();
		
	}	
}