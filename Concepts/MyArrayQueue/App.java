public class App {
    public static void main(String[] args) {
        ArrayQueue<String> queue = new ArrayQueue<>();

        // Test boolean enqueue(E e)
        queue.enqueue("Mike");
        queue.enqueue("John");
        queue.enqueue("Harold");
        queue.enqueue("Shawn");
        queue.enqueue("Desmond");
        System.out.println(queue.toString());

        // // Test E dequeue()
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
    }
}
