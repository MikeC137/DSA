import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(2.55);
        queue.offer(2.27);
        queue.offer(3.92);
        queue.offer(3.31);
        queue.offer(4.0);
        queue.offer(1.93);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
