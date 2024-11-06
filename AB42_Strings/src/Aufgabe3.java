import java.util.Scanner;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie Ihren Text an \n>> ");
		String txt = scanner.nextLine();
		
		
		System.out.println(txt.replace('z', '§').replace('y', '"').replace('Z', '!').replace('Y', 'Z').replace('§', 'y').replace('"', 'z').replace('!', 'Y'));
		
		scanner.close();
		
	}
	
}
