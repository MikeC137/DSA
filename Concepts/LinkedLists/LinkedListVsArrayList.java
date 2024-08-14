import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Mike");
        namesLinkedList.add("John");
        namesLinkedList.add("Jake");
        namesLinkedList.add("Nick");
        System.out.println(namesLinkedList.get(2)); // Runs in linear time O(n)
        namesLinkedList.add(1, "Jerry");
        // Starts from the beginning, goes to the specified position, adds the element,
        // and changes the references of the previous and next nodes. More efficient
        // way to insert objects in comparison to Array Lists

        // ArrayList
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Mike");
        namesArrayList.add("John");
        namesArrayList.add("Jake");
        namesArrayList.add("Nick");
        System.out.println(namesArrayList.get(2)); // Runs in constant time O(1)
        namesArrayList.add(1, "Jerry");
        // Creates a whole new array and adds every single value in it, including the
        // new value.

        // Linked Lists are better for inserting elements but ArrayLists are better for
        // retrieving elements
    }
}
