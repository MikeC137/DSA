public class App {
    public static void main(String[] args) {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();

        // Test addFirst(E e)
        linkedList.addFirst("1");

        // Test add(int index, E element)
        linkedList.add(1, "2");
        linkedList.add(2, "3");

        // Test addLast(E e)
        linkedList.addLast("55");
        linkedList.addLast("77");

        // Test removeFirst()
        linkedList.removeFirst();

        // Test removeLast()
        linkedList.removeLast();

        // Test remove(int index)
        linkedList.remove(1);
        System.out.println(linkedList.toString());
    }
}
