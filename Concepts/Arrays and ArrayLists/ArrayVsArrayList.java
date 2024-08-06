import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        // Creating
        String[] friendsArray = { "John", "Chris", "Eric", "Luke" };
        ArrayList<String> friendArrayList = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        // Retrieve an element
        System.out.println(friendsArray[1]);
        System.out.println(friendArrayList.get(1));

        // Get the Size
        System.out.println(friendsArray.length);
        System.out.println(friendArrayList.size());

        // Add an element
        // You can't add an elemmnt in an Array
        friendArrayList.add("Mitch");

        // Set an element
        friendsArray[0] = "Carl";
        friendArrayList.set(0, "Carl");

        // Remove an element
        // You can't remove an element from an Array
        friendArrayList.remove(1);

        // Display the elements
        for (String name : friendsArray) {
            System.out.println(name);
        }
        System.out.println(friendArrayList);
    }
}