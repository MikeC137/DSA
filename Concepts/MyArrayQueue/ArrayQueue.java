import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayQueue<E> implements Queue<E> {
    private static final int INITIAL_CAPACITY = 10;
    private E[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        this.queue = (E[]) new Object[INITIAL_CAPACITY];
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
        if (empty()) {
            return null;
        }
        return queue[front];
    }

    @Override
    public E dequeue() {
        if (empty()) {
            return null;
        }

        E topElement = queue[front];

        queue[front] = null;

        front = (front + 1) % queue.length;

        size--;
        return topElement;
    }

    @Override
    public Iterator iterator() {
        return new Iterator<E>() {
            private int currentIndex = front;
            private int elementsProcessed = 0;

            @Override
            public boolean hasNext() {
                return elementsProcessed < front;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                E currentElement = queue[currentIndex];

                currentIndex = (currentIndex + 1) % queue.length;

                elementsProcessed++;

                return currentElement;
            }

        };
    }

    public boolean empty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (empty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        int currentIndex = front;

        for (int i = front; i < rear; i++) {
            sb.append(queue[currentIndex]);
            currentIndex = (currentIndex + 1) % queue.length;
            if (i != size - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
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
