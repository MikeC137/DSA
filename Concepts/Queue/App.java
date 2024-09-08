import java.util.Queue;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        // enqueue (add) = offer()
        // dequeue (remove) = poll()

        // *** Queue is an interface not a class! Therefore, it can't be instantiated.
        // To utilize queue technology, we need a class that implements Queue interface
        // LinkedLists and PriorityQueues both implement the Queue interface

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek());
        queue.poll();
        // If the queue is empty, poll will not throw an exception

        System.out.println(queue);
    }
}
