public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		int maxNumber = 100;
		int[] array = new int[maxNumber - 1];

		
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 2;
		}
		
		int divide = 2;
		
		for(int i = 0; i < array.length; i++) {
			
			if(divide == 8) {
				break;
			}
			
			if(array[i] % divide == 0) {
				if(array[i] == divide) continue;
				array[i] = 0;
			}
			
			if(i == array.length - 1) {
				i = 0;
				divide++;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) continue;
			System.out.println(array[i]);
		}
		
	}
	
}
