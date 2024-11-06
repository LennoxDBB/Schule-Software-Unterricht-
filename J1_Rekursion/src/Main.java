public class Main {

	public static void main(String[] args) {
		System.out.println(getFacultyOf(90));
	}

	public static double getFacultyOf(int n) {
		if(n <= 1) return 1;
		return n * getFacultyOf(n - 1);
	}
	
}
