public class App {
    public static void main(String[] args) {
        MySinglyLinkedList linkedList = new MySinglyLinkedList<>();

        // Test addFirst(E e)
        linkedList.addFirst("1");
        System.out.println(linkedList.toString());
    }
}
