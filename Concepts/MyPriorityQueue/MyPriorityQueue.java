import java.util.Iterator;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class MyPriorityQueue<E> implements Queue<E> {
    private Node<E> front;
    private Comparator<E> comparator;
    private int size;

    public MyPriorityQueue(Comparator<E> comparator) {
        front = null;
        this.comparator = comparator;
        size = 0;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }

    @Override
    public boolean enqueue(E e) {
        Node<E> newNode = new Node<E>(e);
        if (empty()) {
            front = newNode;
            size++;
            return true;
        }

        Node<E> current = front;
        Node<E> previous = null;

        while (current != null && hasHigherPriority(current.data, e)) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            newNode.next = front;
            front = newNode;
        } else {
            previous.next = newNode;
            newNode.next = current;
        }

        size++;
        return true;
    }

    private boolean hasHigherPriority(E data, E e) {
        return comparator.compare(data, e) < 0;
    }

    private boolean empty() {
        return size == 0;
    }

    @Override
    public E peek() {
        if (empty()) {
            return null;
        }
        return front.data;
    }

    @Override
    public E dequeue() {
        if (empty()) {
            return null;
        }
        Node<E> headElement = front;
        front = front.next;
        size--;
        return headElement.data;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> current = front;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                E data = current.data;
                current = current.next;
                return data;
            }

        };
    }

    @Override
    public String toString() {
        if (empty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node<E> current = front;

        while (current != null) {
            sb.append(current.data);
            current = current.next;

            if (current != null) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

}
