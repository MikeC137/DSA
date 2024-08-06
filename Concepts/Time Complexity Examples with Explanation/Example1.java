/*	
 * Time Complexity: O(n) + O(n^2) = O(n^2)
 * Space Complexity: O(1)
 */

public class Example1 {
	
	public void function(int[] array) {
		// Part 1: Single loop
		for (int i = 0; i < array.length; i++) { // O(n)
			// O(1) operation
		}

		// Part 2: Nested loops
		for (int i = 0; i < array.length; i++) { // O(n)
			for (int j = 0; j < array.length; j++) { // O(n)
				// O(1) operation
			}
		}
	}
}