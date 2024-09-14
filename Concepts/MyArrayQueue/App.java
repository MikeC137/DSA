import java.util.Iterator;

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

        // Test E dequeue()
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.enqueue("Tim");
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());

        // Test E peek()
        System.out.println(queue.peek());

        // Test boolean hasNext and E next()
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.hasNext());
            System.out.println(iterator.next());
        }

        // Test void clear() and boolean empty()
        System.out.println(queue.empty());
        queue.clear();
        System.out.println(queue);
        System.out.println(queue.empty());
    }
}
