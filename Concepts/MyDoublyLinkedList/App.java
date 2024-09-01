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

    }
}
