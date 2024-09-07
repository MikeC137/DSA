import java.util.Iterator;
import java.util.EmptyStackException;

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
        elements[size] = e;
        size++;
        return e;
    }

    @Override
    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    @Override
    public E pop() {
        if (empty()) {
            throw new EmptyStackException();
        }

        E topElement = elements[size - 1];
        elements[size - 1] = null;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    private void grow() {
        E[] doubleStack = (E[]) new Object[2 * size];
        for (int i = 0; i < elements.length; i++) {
            doubleStack[i] = elements[i];
        }
        elements = doubleStack;
    }

}
