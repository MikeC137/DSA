import java.util.Iterator;

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
