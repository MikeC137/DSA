import java.util.Arrays;

public class example7 {
    public void sortAndPrint(int[] arr) {
    Arrays.sort(arr); //O(nlogn)
    for (int i = 0; i < arr.length; i++) { // O(n)
        if (i == 0 || arr[i] != arr[i - 1]) { //O(1)
            System.out.println(arr[i]); //O(1)
        }
    }
}
}
