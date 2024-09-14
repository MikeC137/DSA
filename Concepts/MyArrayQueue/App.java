public class App {
    public static void main(String[] args) {
        ArrayQueue<String> queue = new ArrayQueue<>();

        // Test boolean enqueue(E e)
        queue.enqueue("Mike");
        queue.enqueue("John");
        queue.enqueue("Harold");
        System.out.println(queue.toString());
    }
}
