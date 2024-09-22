import java.util.Comparator;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        MyPriorityQueue<String> priorityQueue = new MyPriorityQueue<String>(Comparator.naturalOrder());

        // Test boolean enqueue(E e)
        priorityQueue.enqueue("Abel");
        priorityQueue.enqueue("Cain");
        priorityQueue.enqueue("Moses");
        priorityQueue.enqueue("Jesus");
        priorityQueue.enqueue("Matthew");
        System.out.println(priorityQueue.toString());

        // Test E peek()
        System.out.println(priorityQueue.peek());

        // Test E dequeue()
        priorityQueue.dequeue();
        System.out.println(priorityQueue.toString());
        priorityQueue.dequeue();
        System.out.println(priorityQueue.toString());

        // Test Iterator iterator()
        Iterator<String> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
