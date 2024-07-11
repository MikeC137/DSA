public class Example5 {
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5};
		int[] B = {6, 7, 8, 9, 10};
		System.out.println(processArrays(A, B));
	}
	
	public static int processArrays(int[] A, int[] B) {
		int result = 0; // O(1)

		// First loop
		for (int i = 0; i < A.length; i++) { // O(n)
			for (int j = 0; j < A.length; j++) { // O(n)
				result += A[i] * A[j]; // O(1)
			}
		}

		// Second loop
		for (int i = 0; i < B.length; i++) { // O(m)
			result += B[i]; // O(1)
		}

		return result; // O(1)
		// Total time complexity: O(n^2 + m) = O(n^2) quadratic time complexity
	}
}
