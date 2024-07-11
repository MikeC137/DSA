public class Example4 {
	public static void main(String[] args) {

		int sum = function(10);
		System.out.println(sum);

	}
	
	public static int function(int a) {
		int sum = 0;

		for (int i = 0; i < a; i++) { // O(a)
			sum = a + a + a; // O(1)
		}

		int b = 10; // O(1)

		for (int i = 0; i < b; i++) { // O(b)
			sum = b + b + b; // O(1)
		}

		return sum;
	}
}
