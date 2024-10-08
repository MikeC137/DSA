import java.util.Iterator;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayStack<E> implements Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public E push(E e) {
        if (size == elements.length) {
            grow();
        }
        for (int i = size - 1; i >= 0; i--) {
            elements[i + 1] = elements[i];
        }
        elements[0] = e;
        size++;
        return e;
    }

    @Override
    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return elements[0];
    }

    @Override
    public E pop() {
        if (empty()) {
            throw new EmptyStackException();
        }

        E topElement = elements[0];
        elements[0] = null;

        for (int i = 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }

        size--;

        return topElement;
    }

    @Override
    public int search(E e) {
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int currentIndex = size - 1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                return elements[currentIndex--];
            }

        };
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void grow() {
        E[] doubleStack = (E[]) new Object[2 * size];
        for (int i = 0; i < elements.length; i++) {
            doubleStack[i] = elements[i];
        }
        elements = doubleStack;
    }

    @Override
    public String toString() {
        if (empty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
