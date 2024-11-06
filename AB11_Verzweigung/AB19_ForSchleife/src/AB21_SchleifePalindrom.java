public class AB21_SchleifePalindrom {
	
	public static void main(String[] args) {
		
		String result = "";
	
		for(int i = 1; i <= 1000; i++) {
			int save = i;
			while(save >= 1) {
				int letter = save % 10;
				save /= 10;
				result += letter;
				if(String.valueOf(i).equals(result)) {
					System.out.println(result);
				}
			}
			result = "";
		}
	}
}
