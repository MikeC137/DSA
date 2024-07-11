/* 
 * Time Complexity: O(1) + O(1) + O(n) + O(n) + O(n) + O(n) + O(1) + O(1) = O(3n + 4) = O(n)
 */

public class Example2 {
    public static int funChallenge(int[] input) {
        int a = 10; // O(1)
        a = 50 + 3; // O(1)

        for (int i = 0; i < input.length; i++) { // O(n)
            anotherFunction(); // O(n)
            boolean stranger = true; // O(n)
            a++; // O(n)
        }
        return a; // O(1)
    }

    public static void anotherFunction() {
        System.out.println("Another function"); // O(1)
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5}; // O(1)
        int result = funChallenge(input); // O(n)
        System.out.println(result); // O(1)
    }
}