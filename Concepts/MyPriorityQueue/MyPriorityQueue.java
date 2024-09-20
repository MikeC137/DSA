import java.util.Iterator;
import java.util.Comparator;

public class MyPriorityQueue<E> implements Queue<E> {
    private Node<E> front;
    private Comparator<E> comparator;
    private int size;

    public MyPriorityQueue() {
        front = null;
        size = 0;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;
        private Node<E> previous;

        public Node(E data) {
            this.data = data;
            next = null;
            previous = null;
        }
    }

    @Override
    public boolean enqueue(E e) {
        Node<E> newNode = new Node<E>(e);
        if (empty()) {
            front = newNode;
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

    private boolean empty() {
        return size == 0;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public E dequeue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

}
