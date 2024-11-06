public class PrimeNumberList {
	
	public PrimeNumber first;
	
	public String getListFrom(int n) {		
		if(n >= size()) return "";
		return getContentByIndex(n) + "\n" + getListFrom(n + 1); 
	}
	
	public int getContentByIndex(int index) {
		PrimeNumber hold;
		int currentIndex = 0;
		
		hold = this.first;
		
		if(hold == null) {
			return -1;
		}
		
		while(hold.next != null) {
			if(currentIndex == index) break;
			
			hold = hold.next;
			currentIndex++;
		}
		
		if(index > currentIndex || index < 0) return -1;
		
		return hold.content;
	}
	
	public boolean contains(int content) {
		PrimeNumber hold;
		
		hold = this.first;
		
		while(hold != null) {
			if(content == hold.content) return true;
			
			hold = hold.next;
		}
				
		return false;
	}
	
	public void append(int number) {
		if(this.isEmpty()) {
			this.first = new PrimeNumber();
			this.first.content = number;
			this.first.next = null;
			return;
		}
		
		PrimeNumber hold;
		
		hold = this.first;

		while(hold.next != null) {
			hold = hold.next;
		}
		
		hold.next = new PrimeNumber();
		hold.next.content = number;
		hold.next.next = null;
	}
	
	public void replace(int index, int content) {
		if(size() == 0) {
			System.out.println("Fehler! Liste ist leer!");
			return;
		}
		
		PrimeNumber hold;
		int currentIndex = 0;
		
		hold = this.first;
		
		while(hold.next != null) {
			if(currentIndex == index) break;
			
			hold = hold.next;
			currentIndex++;
		}
		
		if(index > currentIndex || index < 0) return;
		
		hold.content = content;
	}
	
	public void insertFront(int content) {
		PrimeNumber hold;
		PrimeNumber newPrimeNumber;
		
		hold = this.first;
		
		newPrimeNumber = new PrimeNumber();
		newPrimeNumber.content = content;
		
		newPrimeNumber.next = hold;
		this.first = newPrimeNumber;
		
		return;
	}
	
	
	
	public int removeFront() {
		PrimeNumber hold;
		int content = 0;
		
		hold = this.first;
		
		if(isEmpty()) {
			System.out.println("Fehler! Die Liste ist leer!");
			return -1;
		}
		
		content = hold.content;
		this.first = hold.next;
		
		return content;
	}
	
	public int remove(int index) {
		PrimeNumber hold;
		int content = -1;
		int currentIndex = 0;
		
		hold = this.first;
		
		if(isEmpty()) {
			System.out.println("Fehler! Die Liste ist leer!");
			return -1;
		}
		
		if(index < 0) {
			System.out.println("Fehler! Index ist nicht in der Liste!");
			return -1;
		}
		
		if(index == 0) {
			content = hold.content;
			this.first = hold.next;
			return content;
		}
		
		while(hold.next != null) {
			if(index - currentIndex == 1) {
				content = hold.next.content;
				hold.next = hold.next.next;
				return content;
			}
			
			currentIndex++;
			hold = hold.next;
		}
		
		System.out.println("Fehler! Index ist nicht in der Liste!");
		return content;
	}
	
	public void removeElement(int content) {
		PrimeNumber hold;
				
		if(isEmpty()) {
			System.out.println("Fehler! Die Liste ist leer!");
			return;
		}
		
		hold = this.first;
		
		while(hold.next != null) {
			if(hold.next.content == content) {
				
			}
		}
	}
	
	public void insert(int index, int content) {
		if(index < 0 || index > size() - 1) {
			System.out.println("Fehler! Index ist nicht in der Liste!");
			return;
		}
		
		PrimeNumber hold;
		PrimeNumber newPrimeNumber;
		int currentIndex = 0;
		
		hold = this.first;
		
		newPrimeNumber = new PrimeNumber();
		newPrimeNumber.content = content;
		
		if(index == 0) {
			newPrimeNumber.next = hold;
			this.first = newPrimeNumber;
			
			return;
		}
		
		while(hold.next != null) {
			
			if(index - 1 == currentIndex) {
				newPrimeNumber.next = hold.next;
				hold.next = newPrimeNumber;
				
				return;
			}
			
			currentIndex++;
			hold = hold.next;
		}
	}
	
	public void printPrimeNumberList() {
		PrimeNumber hold;		
		
		hold = this.first;
				
		while(hold != null) {
			System.out.println(hold.content);
			hold = hold.next;
		}
	}
	
	public int size() {
		PrimeNumber hold;
		int currentIndex = 0;
		
		hold = this.first;
		
		if(hold == null) {
			return 0;
		}
		
		while(hold != null) {			
			hold = hold.next;
			currentIndex++;
		}
				
		return currentIndex;
	}
	
	public boolean isEmpty() {
		if(first == null) {
			return true;
		}
		
		return false;
	}
}
