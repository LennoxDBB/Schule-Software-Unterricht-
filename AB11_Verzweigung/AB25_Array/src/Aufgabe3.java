public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		int max = 100;
		int[] array = new int[max - 1];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 2;
		}
		
		for(int i = 0; i < array.length; i++) {			
			for(int j = 2; j <= 7; j++) {
				if(array[i] % j != 0) continue;
				array[i] = 0;
			}
			
			if(array[i] != 0) {
				System.out.println(array[i]);
			}
		}
		
	}
	
}
