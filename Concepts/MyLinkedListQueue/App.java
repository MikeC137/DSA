import java.util.Iterator;

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

        // Test Iterator iterator()
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Test void clear() and empty()
        System.out.println(queue.empty());
        queue.clear();
        System.out.println(queue.empty());
    }
}
