import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayQueue<E> implements Queue<E> {
    private static final int INITIAL_CAPACITY = 10;
    private E[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        E[] queueArray = (E[]) new Object[INITIAL_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public E element() {
        if (empty()) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    @Override
    public boolean enqueue(E e) {
        if (queue.length == INITIAL_CAPACITY) {
            grow();
        }
        queue[rear] = e;
        rear = (rear + 1) % queue.length;
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

    public boolean empty() {
        return size == 0;
    }

    private void grow() {
        E[] newArray = (E[]) new Object[queue.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = queue[(front + i) % queue.length];
        }

        queue = newArray;

        front = 0;

        rear = size;
    }
}
