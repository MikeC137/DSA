import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		System.out.println("Initial list: " + list);

		list.add(1, "X");
		System.out.println("After adding X at index 1: " + list);

		list.remove(2);
		System.out.println("After removing element at index 2: " + list);

		System.out.println("Element at index 3: " + list.get(3));

		list.set(3, "Y");
		System.out.println("After setting element at index 3 to Y: " + list);

		System.out.println("Index of element B: " + list.indexOf("B"));
		System.out.println("Index of element Z: " + list.indexOf("Z"));

		System.out.println("Is list empty? " + list.isEmpty());
		System.out.println("Size of list: " + list.size());

		list.clear();
		System.out.println("After clearing list: " + list);
	}
}