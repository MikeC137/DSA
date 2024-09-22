import java.util.Comparator;

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
    }
}
