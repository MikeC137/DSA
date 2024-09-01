import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        MyDoublyLinkedList<String> list = new MyDoublyLinkedList<>();

        // Test add(int index, E e)
        list.add(0, "Jake");
        list.add(1, "Mike");
        list.add(2, "John");
        list.add(3, "Tim");
        list.add(4, "Ryan");
        System.out.println(list.toString());

        // Test addFirst(E e)
        list.addFirst("Peter");
        System.out.println(list.toString());

        // Test addLast(E e)
        list.addLast("Dave");
        System.out.println(list.toString());

        // Test removeFirst()
        list.removeFirst();
        System.out.println(list.toString());

        // Test removeLast()
        list.removeLast();
        System.out.println(list.toString());

        // Test remove(int index)
        list.remove(2);
        System.out.println(list.toString());

        // Test remove(Object o)
        list.remove("Tim");
        System.out.println(list.toString());

        // Test getFirst()
        System.out.println(list.getFirst().toString());

        // Test getLast()
        System.out.println(list.getLast().toString());

        // Test get(int index)
        System.out.println(list.get(1).toString());

        // Test set(int index, E e)
        list.set(2, "Howard");
        System.out.println(list.toString());

        // Test contains (Object o)
        System.out.println(list.contains("Mike"));
        System.out.println(list.contains("Ryan"));

        // Test indexOf(Object o)
        System.out.println(list.indexOf("Mike"));

        // Test lastIndexOf(Object o)
        list.add(1, "Mike");
        System.out.println(list.lastIndexOf("Mike"));

        // Test Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Test clear()
        list.clear();
        System.out.println(list);
    }
}
