import java.util.Scanner;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hallo, wie ist dein Name?");
		String name = scanner.next();
		
		System.out.println("Hallo " + name);
		
		scanner.close();
		
	}
	
}
