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

        // Test E peek() and E dequeue()
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
