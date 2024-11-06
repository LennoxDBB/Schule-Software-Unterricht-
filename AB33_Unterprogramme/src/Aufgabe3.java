import java.util.Scanner;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine Zahl an:");
		int num = Math.abs(scanner.nextInt());
		
		String s = isEven(num) ? "gerade" : "ungerade";
		
		System.out.println("Die Zahl ist " + s);
		
		scanner.close();
	}
	
	static boolean isEven(int num) {
		
		if(num % 2 == 0) {
			return true;
		}
		
		return false;
		
	}
	
}
