public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		  int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
		  
		  for(int i = 0; i < numbers.length; i++) {
			  for(int j = 0; j < numbers[i].length; j++) {
				  System.out.println(numbers[i][j]);
			  }
		  }
		  
		  System.out.println("");
		  
		  char[][] letters = {{'a', 'b'}, {'c', 'd'}, {'e', 'f'}};
		  for(int i = 0; i < letters.length; i++) {
			  for(int j = 0; j < letters[i].length; j++) {
				  System.out.println(letters[i][j]);
			  }
		  }
		  
		  System.out.println("");
		  
		  double[][] doubles = {{1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}};
		  for(int i = 0; i < doubles.length; i++) {
			  for(int j = 0; j < doubles[i].length; j++) {
				  System.out.println(doubles[i][j]);
			  }
		  }
	}
	
}
