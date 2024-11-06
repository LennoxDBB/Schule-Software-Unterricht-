public class Aufgabe2 {
	
	public static void main(String[] args) {
		
		System.out.println(signum(1));
		
	}
	
	static String signum(int num) {
		
		if(num < 0) {
			return "-1";
		} else if(num > 0) {
			return "+1";
		}
		
		return "0";
		
	}
	
}
