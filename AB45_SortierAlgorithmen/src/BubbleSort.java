public class BubbleSort {
	
	static int[] sortToHigher(int[] array) {
		
		int runs = 0;
		boolean isSorted = false;
		
		while(!isSorted) {
			isSorted = true;
			
			for(int a = 1 + runs; a < array.length - runs; a++) {
				if(array[a - 1] > array[a]) {
					
					int save = array[a];
					array[a] = array[a - 1];
					array[a - 1] = save;
					isSorted = false;
				}
			}
			
			if(isSorted) return array;
			isSorted = true;
			
			for(int i = array.length - (2 + runs); i >= runs; i--) {				
				
				if(array[i + 1] < array[i]) {
					
					int save = array[i];
					array[i] = array[i + 1];
					array[i + 1] = save;
					isSorted = false;
				}
					
			}
			
			if(isSorted) return array;
			runs++;
			
			
		}
		return array;
	}
	
	static int[] sortToLower(int[] array) {
		
		for(int a = 0; a < array.length - 1; a++) {
		
			for(int i = 1; i < array.length; i++) {
				
				if(array[i] < array[i - 1]) {
					
					int save = array[i];
					array[i] = array[i - 1];
					array[i - 1] = save;
					
				}
				
			}
		
		}
		
		return array;
	}
	
	static String[] sortAlphabetic(String[] array) {
		
		for(int i = 0; i < array.length - 1; i++) {
			
			for(int j = 1; j < array.length; j++) {
				
				if(array[j - 1].compareToIgnoreCase(array[j]) > 0) {
					
					String save = array[j];
					array[j] = array[j - 1];
					array[j - 1] = save;
					
				}
				
			}
			
		}
		return array;
		
	}
	
	public static void main(String[] args) {
		int[] array = {8, 12, 34, 173, 890, 128, 19, 2048, 0, 11, 13, 52, 58, 91, 192, 538};
		array = sortToHigher(array);
		
		String[] words = {"soccer", "badminton", "basketball", "surfing", "sailing", "swimming", "darts", "golfing"};
		words = sortAlphabetic(words);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
		
		System.out.println("\n");
		
		for(int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " | ");
		}
		
	}
	
}
