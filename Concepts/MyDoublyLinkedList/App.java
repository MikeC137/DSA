public class App {
    public static void main(String[] args) {
        MyDoublyLinkedList<String> list = new MyDoublyLinkedList<>();

        // Test add(int index, E e)
        list.add(0, "Jake");
        list.add(1, "Mike");
        list.add(2, "John");
        list.add(3, "Tim");
        System.out.println(list.toString());

        // Test addFirst(E e)
        list.addFirst("Peter");
        System.out.println(list.toString());
    }
}
