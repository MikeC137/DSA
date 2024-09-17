public class App {
    public static void main(String[] args) {
        LinkedListQueue<String> queue = new LinkedListQueue<>();

        // Test boolean enqueue(E e)
        queue.enqueue("Mike");
        queue.enqueue("John");
        queue.enqueue("Tim");
        queue.enqueue("Shawn");
        queue.enqueue("Harold");
        System.out.println(queue);

    }
}
