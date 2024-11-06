public class Main {

	static PrimeNumberList primeNumberList;
	
	public static void main(String[] args) {
		primeNumberList = new PrimeNumberList();
		
		
		primeNumberList.append(2);
		primeNumberList.append(3);
		primeNumberList.append(5);
		primeNumberList.append(7);
		
		for(int i = 8; i < 100; i++) {
			if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) continue;
			
			primeNumberList.append(i);
		}
		
		System.out.println(primeNumberList.getListFrom(10));
		
	}
	
}
