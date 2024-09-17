import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListQueue<E> implements Queue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public LinkedListQueue() {
        front = null;
        rear = null;
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
        Node<E> newElement = new Node<>(e);
        if (empty()) {
            front = newElement;
            rear = newElement;
        } else {
            rear.next = newElement;
            rear = newElement;
        }
        size++;
        return true;
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
        E firstElement = front.data;
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }

        return firstElement;
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

    public boolean empty() {
        return (size == 0);
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
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
