import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();

        // Test addFirst(E e)
        linkedList.addFirst("1");

        // Test add(int index, E element)
        linkedList.add(1, "2");
        linkedList.add(2, "3");
        linkedList.add(3, "42");

        // Test addLast(E e)
        linkedList.addLast("55");
        linkedList.addLast("77");

        // Test removeFirst()
        linkedList.removeFirst();

        // Test removeLast()
        linkedList.removeLast();

        // Test remove(int index)
        linkedList.remove(1);

        // Test set(int index, E e)
        linkedList.set(1, "27");

        // Test getFirst()
        String firstElement = linkedList.getFirst();
        System.out.println(firstElement);

        // Test getLast()
        String lastElement = linkedList.getLast();
        System.out.println(lastElement);

        // Test get(int index)
        String secondElement = linkedList.get(1);
        System.out.println(secondElement);

        // Test contains(Object e)
        boolean invalidElement = linkedList.contains("22");
        boolean validElement = linkedList.contains("27");
        System.out.println(invalidElement);
        System.out.println(validElement);

        // Test indexOf(Object e)
        System.out.println(linkedList.indexOf(secondElement));
        System.out.println(linkedList.indexOf(firstElement));

        // Test lastIndexOf(Object e)
        linkedList.add(2, "55");
        System.out.println(linkedList);
        System.out.println(linkedList.lastIndexOf("55"));

        // Test Iterator
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Test clear()
        linkedList.clear();
        System.out.println(linkedList);
    }
}
