public class Example6 {

    public void printPairs(int[] arr) {
        int n = arr.length; // O(1)
        for (int i = 0; i < n; i++) { // O(n)
            for (int j = 0; j < n; j++) { // O(n)
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }
}

